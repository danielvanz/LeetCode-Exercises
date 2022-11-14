import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class exercise6173 {
    public static int maximumRows(int[][] mat, int cols) {

        int rowscovered = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < mat[0].length; i++) {
            map.put(i, 0);
            for (int j = 0; j < mat.length; j++) {
                if (mat[j][i] == 1) {
                    map.replace(i, map.get(i) + 1);
                }
            }
        }

        ArrayList<Integer> columnIndexes = new ArrayList<>();

        for (int i = 0; i < cols; i++) {
            int key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
            columnIndexes.add(key);
            map.remove(key);
        }

        for (int i = 0; i < mat.length; i++) {
            boolean covered = true;
            for (int j = 0; j < mat[0].length; j++) {
                if (!columnIndexes.contains(j)) {

                    if (mat[i][j] == 1) {
                        covered = false;
                    }

                }
            }
            if (covered == true) {
                rowscovered++;
            }
        }

        return rowscovered;

    }

    public static void main(String[] args) {

        int[][] poopie = new int[][] { { 0, 0, 0 }, { 1, 0, 1 }, { 0, 1, 1 }, { 0, 0, 1 } };
        System.out.println(maximumRows(poopie, 2));
    }
}
