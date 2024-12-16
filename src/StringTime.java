class StringTime {

    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        String result = "";

        for (int i = 0; i < length; i++) {
            result = result + "D";
        }

        System.out.println("Finished creating a string consisting of " + length + " characters.");
    }
}
