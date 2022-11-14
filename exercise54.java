import java.util.ArrayList;
import java.util.List;

public class exercise54 {
    public static List<Integer> spiralOrder(int[][] matrix) {

        int currentColumn = 0;
        int currentRow = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (list.size() != matrix.length * matrix[0].length) {

            // Move to the right
            while (currentColumn < matrix[0].length && matrix[currentRow][currentColumn] != 101) {
                list.add(matrix[currentRow][currentColumn]);
                matrix[currentRow][currentColumn] = 101;
                currentColumn++;
            }

            currentColumn--;
            currentRow++;

            // Move to the Bottom
            while (currentRow < matrix.length && matrix[currentRow][currentColumn] != 101) {
                list.add(matrix[currentRow][currentColumn]);
                matrix[currentRow][currentColumn] = 101;
                currentRow++;
            }

            currentRow--;
            currentColumn--;

            // Move to the left
            while (currentColumn >= 0 && matrix[currentRow][currentColumn] != 101) {
                list.add(matrix[currentRow][currentColumn]);
                matrix[currentRow][currentColumn] = 101;
                currentColumn--;
            }

            currentRow--;
            currentColumn++;

            // Move to the Top
            while (currentRow >= 0 && matrix[currentRow][currentColumn] != 101) {
                list.add(matrix[currentRow][currentColumn]);
                matrix[currentRow][currentColumn] = 101;
                currentRow--;
            }

            currentRow++;
            currentColumn++;

        }

        return list;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 3 }, { 2 } };
        System.out.println(spiralOrder(matrix));
    }

}
