public class BigNumber {

    public static int numberOfBig(int[][] arr, int a) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > a) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] arr = {{4, 5, 6}, {9, 10}};
        System.out.println(BigNumber.numberOfBig(arr, 10));
    }
}
