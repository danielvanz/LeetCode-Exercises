import java.util.ArrayList;
import java.util.HashSet;

public class imcResult {
    /*
     * Complete the 'moves' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. INTEGER n
     * 2. INTEGER startRow
     * 3. INTEGER startCol
     * 4. INTEGER endRow
     * 5. INTEGER endCol
     * 6. INTEGER bishopRow
     * 7. INTEGER bishopCol
     */

    public static int moves(int n, int startRow, int startCol, int endRow, int endCol, int bishopRow, int bishopCol) {

        return getMinimalMoves(n, startRow, startCol, endRow, endCol, bishopRow, bishopCol, true, 0,
                new HashSet<String>());

    }

    public static int getMinimalMoves(int n, int startRow, int startCol, int endRow, int endCol, int bishopRow,
            int bishopCol, boolean bishopExist, int steps, HashSet<String> hashSet) {

        if (startRow == endRow && startCol == endCol) {
            return steps;
        }

        if (startRow == bishopRow && startCol == bishopCol) {
            bishopExist = false;
        }
        if (bishopExist) {
            bishopExist = bishopKilled(startRow, startCol, bishopCol, bishopRow, n, bishopExist);
        }

        if (isLegalMove(startRow, startCol, n) && (!isDublicateStep(startRow, startCol, hashSet))
                && (!isOnBishopPath(startRow,
                        startCol, bishopCol, bishopRow, n, bishopExist))) {

            hashSet.add(startRow + " " + startCol);
            int[] possibilities = new int[3];

            possibilities[0] = getMinimalMoves(n, startRow + 2, startCol + 1, endRow, endCol, bishopRow, bishopCol,
                    bishopExist,
                    steps++, hashSet);
            possibilities[1] = getMinimalMoves(n, startRow + 2, startCol - 1, endRow, endCol, bishopRow, bishopCol,
                    bishopExist,
                    steps++, hashSet);
            possibilities[2] = getMinimalMoves(n, startRow - 2, startCol + 1, endRow,
                    endCol, bishopRow, bishopCol,
                    bishopExist,
                    steps++, hashSet);
            possibilities[3] = getMinimalMoves(n, startRow - 2, startCol - 1, endRow,
                    endCol, bishopRow, bishopCol,
                    bishopExist,
                    steps++, hashSet);
            possibilities[4] = getMinimalMoves(n, startRow + 1, startCol + 2, endRow,
                    endCol, bishopRow, bishopCol,
                    bishopExist,
                    steps++, hashSet);
            possibilities[5] = getMinimalMoves(n, startRow - 1, startCol + 2, endRow,
                    endCol, bishopRow, bishopCol,
                    bishopExist,
                    steps++, hashSet);
            possibilities[6] = getMinimalMoves(n, startRow + 1, startCol - 2, endRow,
                    endCol, bishopRow, bishopCol,
                    bishopExist,
                    steps++, hashSet);
            possibilities[7] = getMinimalMoves(n, startRow - 1, startCol - 2, endRow,
                    endCol, bishopRow, bishopCol,
                    bishopExist,
                    steps++, hashSet);

            int minimal = Integer.MAX_VALUE;

            for (int i = 0; i < possibilities.length; i++) {
                if (possibilities[i] < minimal) {
                    minimal = possibilities[i];
                }
            }

            if (minimal == Integer.MAX_VALUE) {
                return -1;
            } else {
                return minimal;
            }

        }

        return -1;
    }

    private static boolean bishopKilled(int startRow, int startCol, int bishopCol, int bishopRow, int n,
            boolean bishopExist) {
        return startCol == bishopCol && startRow == bishopRow;
    }

    private static boolean isOnBishopPath(int startRow, int startCol, int bishopCol, int bishopRow, int n,
            boolean bishopExist) {

        if (!bishopExist) {
            return false;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < bishopCol; i++) {

        }

        return false;
    }

    private static boolean isDublicateStep(int i, int j, HashSet<String> hashSet) {
        return hashSet.contains(i + "" + j);
    }

    private static boolean isLegalMove(int i, int j, int n) {

        if (i < 0 || i >= n || j < 0 || j >= n) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(moves(6, 0, 0, 0, 2, 0, 1));
    }
}
