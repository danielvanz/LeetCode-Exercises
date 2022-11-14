public class exercise1155 {
    public static int numRollsToTarget(int n, int k, int target) {

        long[][] result = initialize(n, k, target);

        for (int i = 1; i < result.length; i++) {
            for (int j = i; j < result[0].length; j++) {
                long tempResult = 0;
                for (int j2 = j - k; j2 < j; j2++) {
                    if (j2 < 0 || j2 > result[0].length) {
                        continue;
                    }

                    tempResult = (tempResult + result[i - 1][j2]) % (int) (Math.pow(10, 9) + 7);
                }
                result[i][j] = tempResult;
            }
        }

        return (int) result[n - 1][target - 1];

    }

    public static long[][] initialize(int n, int k, int target) {

        long[][] result = new long[n][target];

        for (int i = 0; i < k; i++) {
            result[0][i] = 1;
            if (i + 1 >= result[0].length) {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int dices = 30;
        int diceSize = 30;
        int target = 500;

        System.out.println(numRollsToTarget(dices, diceSize, target));
    }
}
