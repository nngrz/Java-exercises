class StringTime {

    String buildString(int length) {
        String result = "";
        for (int i = 0; i < length; i++) {
            result = result + "D";
        }
        return "Finished creating a string consisting of " + length + " characters.";
    }

    public static void main(String[] args) {
        System.out.println("Enter length: " + args[0]);

        StringTime stringTime = new StringTime();
        System.out.println(stringTime.buildString(Integer.parseInt(args[0])));
    }
}
