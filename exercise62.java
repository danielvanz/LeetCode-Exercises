public class exercise62 {
    public int uniquePaths(int m, int n) {

        int[][] result = new int[m][n];

        for (int i = 0; i < result.length; i++) {
            result[i][0] = 1;
        }

        for (int i = 0; i < result[0].length; i++) {
            result[0][i] = 1;
        }

        for (int i = 1; i < result.length; i++) {
            for (int j = 1; j < result[0].length; j++) {
                result[i][j] = result[i - 1][j] + result[i][j - 1];
            }
        }

        return result[m - 1][n - 1];

    }
}