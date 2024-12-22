class IntegerToBinary {
    public static void main(String[] args) {
        int number = 255;
        StringBuilder result = new StringBuilder();

        while (number != 0) {
            int bit = number % 2;
            number = number / 2;
            result.append(Integer.toString(bit));
        }


        System.out.println(result.reverse().toString());
    }
}
