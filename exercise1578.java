public class exercise1578 {
    public static int minCost(String colors, int[] neededTime) {

        char[] colorsArray = colors.toCharArray();
        char currentColor = '9';

        int minTime = 0;
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < colorsArray.length; i++) {
            if (colorsArray[i] != currentColor) {
                currentColor = colorsArray[i];
                endIndex = i - 1;
                if (endIndex - startIndex >= 1) {
                    minTime += minSequence(startIndex, endIndex, neededTime);
                }
                startIndex = i;
            }

        }

        if (colorsArray.length - startIndex - 1 >= 1) {
            minTime += minSequence(startIndex, colorsArray.length - 1, neededTime);
        }

        return minTime;
    }

    public static int minSequence(int startIndex, int endIndex, int[] neededTime) {

        if (endIndex - startIndex == 1) {
            return Math.min(neededTime[startIndex], neededTime[endIndex]);
        }

        int total = 0;
        int maximal = Integer.MIN_VALUE;

        for (int i = startIndex; i <= endIndex; i++) {
            total += neededTime[i];
            if (neededTime[i] > maximal) {
                maximal = neededTime[i];
            }
        }

        return total - maximal;
    }

    public static void main(String[] args) {
        String colors = "aabbaaababadbadbdbdadbdabadaababadabbaadaba";
        int[] neededTime = new int[] { 9, 1, 18, 35, 26, 29, 39, 40, 6, 24, 8, 20, 13, 25, 14, 30, 5, 7, 41, 38, 28, 22,
                23, 34, 16, 37, 36, 31, 2, 3, 4, 19, 27, 32, 10, 42, 15, 33, 43, 21, 17, 11, 12 };
        System.out.println(minCost(colors, neededTime));

    }
}
