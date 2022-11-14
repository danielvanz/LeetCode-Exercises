import java.util.ArrayDeque;
import java.util.HashSet;

public class exercise994 {

    static class Orange {

        int x;
        int y;

        Orange(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int orangesRotting(int[][] grid) {

        ArrayDeque<Orange> rottenOranges = new ArrayDeque<>();
        HashSet<String> goodOranges = new HashSet<>();
        int minutes = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    rottenOranges.add(new Orange(j, i));
                } else if (grid[i][j] == 1) {
                    goodOranges.add("(" + j + "," + i + ")");
                }
            }
        }

        if (goodOranges.size() == 0 && rottenOranges.size() >= 0) {
            return 0;
        }

        while (!rottenOranges.isEmpty() && !goodOranges.isEmpty()) {
            int numberRottenOranges = rottenOranges.size();

            for (int i = 0; i < numberRottenOranges; i++) {
                Orange rottenOrange = rottenOranges.poll();

                if (goodOranges.contains("(" + (rottenOrange.x - 1) + "," + rottenOrange.y + ")")) {
                    goodOranges.remove("(" + (rottenOrange.x - 1) + "," + rottenOrange.y + ")");
                    rottenOranges.add(new Orange(rottenOrange.x - 1, rottenOrange.y));
                }
                if (goodOranges.contains("(" + (rottenOrange.x + 1) + "," + rottenOrange.y + ")")) {
                    goodOranges.remove("(" + (rottenOrange.x + 1) + "," + rottenOrange.y + ")");
                    rottenOranges.add(new Orange(rottenOrange.x + 1, rottenOrange.y));
                }
                if (goodOranges.contains("(" + rottenOrange.x + "," + (rottenOrange.y - 1) + ")")) {
                    goodOranges.remove("(" + rottenOrange.x + "," + (rottenOrange.y - 1) + ")");
                    rottenOranges.add(new Orange(rottenOrange.x, rottenOrange.y - 1));
                }
                if (goodOranges.contains("(" + rottenOrange.x + "," + (rottenOrange.y + 1) + ")")) {
                    goodOranges.remove("(" + rottenOrange.x + "," + (rottenOrange.y + 1) + ")");
                    rottenOranges.add(new Orange(rottenOrange.x, rottenOrange.y + 1));
                }
            }
            minutes++;
        }

        if (!goodOranges.isEmpty()) {
            return -1;
        }
        return minutes;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][] { { 0, 2 } };
        System.out.println(orangesRotting(grid));
    }
}
