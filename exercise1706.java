public class exercise1706 {
    public static int[] findBall(int[][] grid) {

        int[] answers = new int[grid[0].length];

        for (int i = 0; i < grid[0].length; i++) {
            answers[i] = findRoute(grid, 0, i);
        }
        return answers;
    }

    private static int findRoute(int[][] grid, int r, int c) {

        if (grid.length <= r) {
            return c;
        }

        if ((c == 0 && grid[r][c] == -1) || (c == grid[0].length - 1 && grid[r][c] == 1)) {
            return -1;
        }

        if (grid[r][c] == 1 && grid[r][c + 1] == 1) {
            return findRoute(grid, r + 1, c + 1);
        } else if (grid[r][c] == -1 && grid[r][c - 1] == -1) {
            return findRoute(grid, r + 1, c - 1);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[][] pinball = new int[][] { { -1 } };
        // int[][] pinball = new int[][] { { 1, 1, 1, -1, -1 }, { 1, 1, 1, -1, -1 }, {
        // -1, -1, -1, 1, 1 },
        // { 1, 1, 1, 1, -1 }, { -1, -1, -1, -1, -1 } };
        System.out.println(findBall(pinball));
    }

}
