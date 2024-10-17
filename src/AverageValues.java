public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6, 7};
        int sum = 0;
        int average;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        average = sum / numbers.length;
        System.out.println(average);
    }
}
