class StringBuilderTime {

    String buildString(int length) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append("D");
        }
        return "Finished creating a string consisting of " + length + " characters.";
    }

    public static void main(String[] args) {
        System.out.println("Enter length: " + args[0]);

        StringBuilderTime stringBuilderTime = new StringBuilderTime();
        System.out.println(stringBuilderTime.buildString(Integer.parseInt(args[0])));
    }
}
