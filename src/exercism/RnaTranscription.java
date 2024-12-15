class RnaTranscription {

    public static char DNAToRNATranslator(char dnaNucleotide) {
        return switch(dnaNucleotide) {
            case 'G' -> 'C';
            case 'C' -> 'G';
            case 'T' -> 'A';
            case 'A' -> 'U';
            default -> throw new IllegalArgumentException("Invalid DNA nucleotide: " + dnaNucleotide);
        };
    }

    String transcribe(String dnaStrand) {
        StringBuilder result = new StringBuilder();
        for (char c : dnaStrand.toCharArray()) {
            result.append(DNAToRNATranslator(c));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        RnaTranscription rnaTranscription = new RnaTranscription();
        // test1: empty string
        System.out.println(rnaTranscription.transcribe(""));
        // test2: single character
        System.out.println(rnaTranscription.transcribe("G"));
        // test3: over 1 characters
        System.out.println(rnaTranscription.transcribe("GCTA"));
        // test4: given string has chracter not match "G""C""T""A"
        System.out.println(rnaTranscription.transcribe("SHB"));
    }
}
