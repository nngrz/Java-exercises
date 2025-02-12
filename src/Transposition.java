public class Transposition {
    public static int[][] transpose(int[][] arrin) {
        int rows = arrin.length;
        int cols = arrin[0].length;
        int[][] newArr = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newArr[j][i] = arrin[i][j];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[][] arrin = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] result = Transposition.transpose(arrin);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
