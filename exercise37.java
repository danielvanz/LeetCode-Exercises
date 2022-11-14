import java.util.HashSet;

public class exercise37 {
    public static void solveSudoku(char[][] board, int x, int y) {

        for (int i = x; i < board.length; i++) {
            for (int j = y; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    for (int j2 = 1; j2 <= 9; j2++) {
                        board[i][j] = (char) (j2 + '0');
                        if (!hasConflict(board)) {
                            solveSudoku(board, i, j);
                        }
                    }
                    if (hasConflict(board) || board[i][j] == '9') {
                        board[i][j] = '.';
                        return;
                    }
                }
            }
            x = 0;
            y = 0;
        }

        System.out.println(board);

    }

    static boolean hasConflict(char[][] board) {
        return hasRowConflict(board) || hasColumnConflict(board) || hasBoxConflict(board);
    }

    private static boolean hasBoxConflict(char[][] board) {

        int boxColumn = 3;
        int boxRow = 3;

        for (int i = 0; i <= 7; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = boxColumn - 3; j < boxColumn; j++) {
                for (int j2 = boxRow - 3; j2 < boxRow; j2++) {
                    if (board[j][j2] != '.' && set.contains(board[j][j2])) {
                        return true;
                    }
                    set.add(board[j][j2]);
                }
            }
            if (i == 0 || i == 1 || i == 3 || i == 4 || i == 6 || i == 7) {
                boxColumn += 3;
            } else if (i == 2 || i == 5) {
                boxColumn = 3;
                boxRow += 3;
            }
            set.clear();
        }

        return false;
    }

    private static boolean hasColumnConflict(char[][] board) {

        for (int i = 0; i < board[0].length; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] != '.' && set.contains(board[j][i])) {
                    return true;
                }
                set.add(board[j][i]);
            }
            set.clear();
        }
        return false;
    }

    private static boolean hasRowConflict(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.' && set.contains(board[i][j])) {
                    return true;
                }
                set.add(board[i][j]);
            }
            set.clear();
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] chars = new char[][] { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
        solveSudoku(chars, 0, 0);
    }
}
