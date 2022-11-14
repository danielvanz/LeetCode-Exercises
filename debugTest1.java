public class debugTest1 {
    public static int maximumRows(int[][] mat, int cols) {
        final int N = mat.length;
        final int M = mat[0].length;

        int[] rowMasks = new int[N];
        for (int i = 0; i < N; ++i) {
            rowMasks[i] = makeMask(mat[i]);
        }

        int best = 0;
        int colMax = 1 << M;
        for (int colMask = 0; colMask < colMax; ++colMask) {
            if (Integer.bitCount(colMask) != cols) {
                continue;
            }
            int count = 0;
            for (int rowMask : rowMasks) {
                if ((rowMask & colMask) == rowMask) {
                    ++count;
                }
            }
            best = Math.max(best, count);
        }
        return best;
    }

    private static int makeMask(int[] arr) {
        int mask = 0;
        for (int i = 0; i < arr.length; ++i) {
            mask |= (arr[i] << i);
        }
        return mask;
    }

    public static void main(String[] args) {
        int[][] mat = new int[][] { { 0, 0, 0 }, { 1, 0, 1 }, { 0, 1, 1 }, { 0, 0, 1 } };
        int cols = 2;

        System.out.println(maximumRows(mat, cols));
    }
}
