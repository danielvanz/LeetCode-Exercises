import java.util.HashSet;

public class exercise1335 {

    class CutsSum {

        HashSet<Integer> set;
        int sum;

        CutsSum(int sum) {
            set = new HashSet<>();
            this.sum = sum;
        }

    }

    public static int minDifficulty(int[] jobDifficulty, int d) {

        CutsSum[][] a = new CutsSum[d][jobDifficulty.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i == 0 || i == 1) {
                    if (i == 0) {
                        int max = returnMax(jobDifficulty);
                        for (int k = 0; k < a[0].length; k++) {
                            a[0][k] = new CutsSum(max);
                        }
                    } else {
                        int max = Integer.MIN_VALUE;
                        for (int k = 0; k < a[0].length; k++) {
                            max = Math.max(max, jobDifficulty[k]);
                            a[1][k] = new CutsSum(a[0][k].sum + max);
                            a[1][k].set.add(k);
                        }
                    }
                    break;
                } else {

                    CutsSum temp = new CutsSum(0);

                    for (int k = 0; k < a[0].length; k++) {
                        if (a[i - 1][k].set.contains(k)) {
                            continue;
                        }

                        int cur = a[i - 1][k].sum;

                    }
                }

            }
        }

    }

    private static int returnMax(int[] jobDifficulty) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < jobDifficulty.length; i++) {
            if (max < jobDifficulty[i]) {
                max = jobDifficulty[i];
            }
        }
        return max;
    }

}