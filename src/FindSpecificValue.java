public class FindSpecificValue {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6, 7};
        int k = 9;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == k) {
                System.out.println("True");
            }
        }
    }
}
