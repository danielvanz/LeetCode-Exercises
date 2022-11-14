public class exercise63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int[][] result = new int[obstacleGrid.length][obstacleGrid[0].length];
        int l = result.length;
        int w = result[0].length;

        if (obstacleGrid[0][0] == 1) {
            result[0][0] = 0;
        } else {
            result[0][0] = 1;
        }

        for (int i = 1; i < result.length; i++) {
            if (obstacleGrid[i][0] == 1) {
                result[i][0] = 0;
            } else {
                result[i][0] = result[i - 1][0];
            }
        }
        for (int i = 1; i < result[0].length; i++) {
            if (obstacleGrid[0][i] == 1) {
                result[0][i] = 0;
            } else {
                result[0][i] = result[0][i - 1];
            }
        }

        for (int i = 1; i < result.length; i++) {
            for (int j = 1; j < result[0].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    result[i][j] = 0;
                } else {
                    result[i][j] = result[i - 1][j] + result[i][j - 1];
                }
            }
        }

        return result[l - 1][w - 1];

    }
}
