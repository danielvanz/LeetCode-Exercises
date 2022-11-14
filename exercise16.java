import java.util.Arrays;

public class exercise16 {
    public static int threeSumClosest(int[] nums, int target) {

        int closest = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            int left = 0;
            int right = nums.length - 1;
            int tempClosest = Integer.MAX_VALUE;

            while (left != right) {
                if (left == i || right == i) {
                    if (left == i) {
                        left++;
                    }
                    if (right == i) {
                        right--;
                    }
                } else {

                    int temp = target - nums[i] - nums[left] - nums[right];
                    int currentEstimate = nums[i] + nums[left] + nums[right];

                    if (Math.abs(temp) < Math.abs(target - tempClosest)) {
                        tempClosest = currentEstimate;
                    }

                    if (temp > 0) {
                        left++;
                    } else if (temp < 0) {
                        right--;
                    } else {
                        return target;
                    }

                }
            }

            if (Math.abs(target - tempClosest) < Math.abs(target - closest)) {
                closest = tempClosest;
            }

        }

        return closest;

    }

    public static void main(String[] args) {
        int[] nums = new int[] { 9, 9, 9, 8, 2, 2, 1 };
        int target = 10;
        System.out.println(threeSumClosest(nums, target));
    }

}
