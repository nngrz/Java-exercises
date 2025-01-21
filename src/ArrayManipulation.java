public class ArrayManipulation {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }
        System.out.println("The sum of all elements in the array is: " + sum);
    }
}
