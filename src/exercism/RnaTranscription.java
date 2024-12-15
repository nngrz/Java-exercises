class RnaTranscription {

    String transcribe(String dnaStrand) {
        String result = "";
        for (int i = 0; i < dnaStrand.length(); i++) {
            char c = dnaStrand.charAt(i);
            if (c == 'G') {
                c = 'C';
            } else if (c == 'C') {
                c = 'G';
            } else if (c == 'T') {
                c = 'A';
            } else if (c == 'A') {
                c = 'U';
            } else {
                throw new IllegalArgumentException("Illegal input");
            }
            result = result + c;
        }
        return result;
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
