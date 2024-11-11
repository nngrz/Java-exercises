class SqueakyClean {
    static String whitespaceToUnderscore(String identifier) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < identifier.length(); i++) {
            char ch = identifier.charAt(i);
            if (Character.isWhitespace(ch)) {
                str.append('_');
            } else {
                str.append(ch);
            }
        }
        return str.toString();
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

        for (int i = 0; i < identifier.length(); i++) {
            char ch = identifier.charAt(i);
            if (ch == '4') {
                identifier = identifier.replace(ch, 'a');
            } else if (ch == '3') {
                identifier = identifier.replace(ch, 'e');
            } else if (ch == '0') {
                identifier = identifier.replace(ch, 'o');
            } else if (ch == '1') {
                identifier = identifier.replace(ch, 'l');
            } else if (ch == '7') {
                identifier = identifier.replace(ch, 't');
            } else {
                identifier = identifier;
            }
        }
        return identifier;
    }

    static String omitNoLetter(String identifier) {
        identifier = identifier.replaceAll("[^a-zA-Z0-9_]", "");
        return identifier;
    }

    static String clean(String identifier) {
        return SqueakyClean.omitNoLetter(SqueakyClean.leetspeakToText(SqueakyClean.kebabToCamel(SqueakyClean.whitespaceToUnderscore(identifier))));
    }

    public static void main(String[] args) {
        System.out.println(SqueakyClean.clean("my   Id"));
        System.out.println(SqueakyClean.clean("a-bc-de-fg"));
        System.out.println(SqueakyClean.leetspeakToText("H3ll0 W0rld"));
        System.out.println(SqueakyClean.omitNoLetter("a$#.b"));
    }
}
