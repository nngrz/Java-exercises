public class OddRow {
    
    public static int[][] oddRow(int[][] a) {
        // Count the number of rows with odd indices
        int count = (a.length + 1) / 2;

        // Create a new array to store rows with odd indices
        int[][] newArr = new int[count][a[0].length];
        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
               newArr[i/2] = a[i];
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9},
                        {10, 11, 12}};
        
        int[][] result = oddRow(arr);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
