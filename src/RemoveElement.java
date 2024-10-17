import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] numbers = {9, 8, 7, 6, 5};
        int[] new_numbers = new int[numbers.length - 1];
        int k = 7;
        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (numbers[i] != k) {
                new_numbers[j] = numbers[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(new_numbers));
    }
}
