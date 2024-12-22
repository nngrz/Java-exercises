class StringBuilderTime {

    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append("D");
        }

        System.out.println("Finished creating a string consisting of " + length + " characters.");
    }
}
