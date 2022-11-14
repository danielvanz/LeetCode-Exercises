import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class exercise1770 {
    public static int maximumScore(int[] nums, int[] multipliers) {

        int l = 0;
        int r = nums.length - 1;
        int lm = 0;
        int maxValue = 0;

        return solve(nums, multipliers, l, r, lm, maxValue);

    }

    private static int solve(int[] nums, int[] multipliers, int l, int r, int lm, int maxValue) {

        if (lm == multipliers.length) {
            return maxValue;
        }

        int leftChoice = maxValue + (nums[l] * multipliers[lm]);
        int rightChoice = maxValue + (nums[r] * multipliers[lm]);
        lm++;
        int oldRight = r;
        int newRight = r - 1;
        int oldLeft = l;
        int newLeft = l + 1;

        return Math.max(solve(nums, multipliers,
                newLeft,
                oldRight, lm, leftChoice),
                solve(nums, multipliers, oldLeft, newRight, lm, rightChoice));
    }

    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3 };
        int[] mults = new int[] { 3, 2, 1 };

        System.out.println(maximumScore(array, mults));
    }
}
