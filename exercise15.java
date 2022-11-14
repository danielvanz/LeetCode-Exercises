import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class exercise15 {
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int l = 0;
            int r = nums.length - 1;
            while (l != r) {
                if (l == i)
                    l++;
                else if (r == i)
                    r--;
                else {
                    int temp = nums[i] + nums[l] + nums[r];
                    if (temp == 0) {
                        if (!alreadyPresent(result, nums[i], nums[l], nums[r])) {
                            result.add(addList(nums[i], nums[l], nums[r]));
                        }
                        l++;
                    } else if (temp > 0) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }

        return result;

    }

    private static List<Integer> addList(int i, int j, int k) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(i);
        test.add(j);
        test.add(k);
        Collections.sort(test);
        return test;
    }

    private static boolean alreadyPresent(List<List<Integer>> result, int i, int j, int k) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(i);
        test.add(j);
        test.add(k);
        Collections.sort(test);
        return result.contains(test);
    }

    public static void main(String[] args) {
        int[] nums = new int[] { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(nums));
    }
}
