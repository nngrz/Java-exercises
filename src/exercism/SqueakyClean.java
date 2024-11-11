class SqueakyClean {
    static String whitespaceToUnderscore(String identifier) {
//        Alternative solution: solve with StringBuilder:
//        StringBuilder str = new StringBuilder();
//
//        for (int i = 0; i < identifier.length(); i++) {
//            char ch = identifier.charAt(i);
//            if (Character.isWhitespace(ch)) {
//                str.append('_');
//            } else {
//                str.append(ch);
//            }
//        }
//        return str.toString();
        return identifier.replace(" ", "_");
    }

    static String kebabToCamel(String identifier) {
        String[] splitedKebabs = identifier.split("-");
        StringBuilder str = new StringBuilder(splitedKebabs[0]);
        for (int i = 1; i < splitedKebabs.length; i++) {
            String capitalized = splitedKebabs[i].substring(0,1).toUpperCase() + splitedKebabs[i].substring(1);
            str.append(capitalized);
        }
        return str.toString();
    }

    static String leetspeakToText(String identifier) {
        return identifier.replace('4', 'a')
                        .replace('3', 'e')
                        .replace('0', 'o')
                        .replace('1', 'l')
                        .replace('7', 't');
    }

    static String omitNoLetter(String identifier) {
        return identifier.replaceAll("[^a-zA-Z0-9_]", "");
    }

    static String clean(String identifier) {
        return SqueakyClean.omitNoLetter(
                    SqueakyClean.leetspeakToText(
                        SqueakyClean.kebabToCamel(
                            SqueakyClean.whitespaceToUnderscore(identifier)
                )
            )
        );
    }

    public static void main(String[] args) {
        System.out.println(SqueakyClean.clean("my   Id"));
        System.out.println(SqueakyClean.clean("a-bc-de-fg"));
        System.out.println(SqueakyClean.leetspeakToText("H3ll0 W0rld"));
        System.out.println(SqueakyClean.omitNoLetter("a$#.b"));
    }
}
