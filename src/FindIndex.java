public class FindIndex {
    public static void main(String[] args) {
        int[] numbers = {9, 8, 7, 6, 5};
        int k = 7;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == k) {
                System.out.println(i);
            }
        }
    }
}
