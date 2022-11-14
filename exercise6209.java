import java.util.ArrayList;

public class exercise6209 {
    public static int[] productQueries(int n, int[][] queries) {

        int[] answers = new int[queries.length];
        ArrayList<Integer> powers = new ArrayList<>();

        int power = 1;

        while (n != 0) {
            if (power > n) {
                n -= (power / 2);
                powers.add(power / 2);
                power = 1;
            } else if (power == n) {
                powers.add(power);
                break;
            } else {
                power *= 2;
            }
        }

        long[] pow = new long[powers.size()];

        for (int i = 0; i < pow.length; i++) {
            pow[i] = powers.get(powers.size() - i - 1);
        }

        for (int i = 0; i < queries.length; i++) {
            long result = 1;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                result = ((result % 1000000007) * (pow[j] % 1000000007)) % 1000000007;

                if (result < 0) {
                    result = result * -1;
                }
            }

            answers[i] = (int) result;
            result = 1;
        }

        return answers;

    }

    public static void main(String[] args) {
        int n = 508;
        int[][] queries = new int[][] { { 0, 6 } };
        productQueries(n, queries);
    }
}
