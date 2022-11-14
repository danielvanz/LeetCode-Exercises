import java.util.ArrayList;

public class exercise566 {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        if (r * c != mat.length * mat[0].length) {
            return mat;
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                list.add(mat[i][j]);
            }
        }

        int[][] array = new int[r][c];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = list.get(0);
                list.remove(0);
            }
        }

        return array;

    }

    public static void main(String[] args) {
        int[][] test = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
        int r = 3;
        int c = 2;

        int[][] result = matrixReshape(test, r, c);

    }

}