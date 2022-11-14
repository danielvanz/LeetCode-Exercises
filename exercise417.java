import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class exercise417 {

    class Cell {
        int x;
        int y;
        int h;

        Cell(int x, int y, int h) {
            this.x = x;
            this.y = y;
            this.h = h;
        }

    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        ArrayList<Cell> cells = new ArrayList<>();
        ArrayList<ArrayList<Cell>> result = new ArrayList<>();

        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[0].length; j++) {
                cells.add(new Cell(j, i, heights[i][j]));
            }
        }

        for (int i = 0; i < cells.size(); i++) {
            ArrayDeque<Cell> q = new ArrayDeque<>();
            q.add(cells.get(0));
            boolean pacific = false;
            boolean atlantic = false;

            while (!q.isEmpty()) {

                int length = q.size();

                for (int j = 0; j < length; j++) {
                    Cell cell = q.poll();

                }

            }

            if (pacific && atlantic) {

            }

        }

    }
}
