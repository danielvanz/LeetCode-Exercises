public class exercise198 {
    public int rob(int[] nums) {

        int[] paths = new int[nums.length];

        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        paths[0] = nums[0];
        paths[1] = nums[1];
        paths[2] = nums[2] + nums[0];
        int result = Math.max(paths[1], paths[2]);

        for (int i = 3; i < nums.length; i++) {
            paths[i] = nums[i] + Math.max(paths[i - 2], paths[i - 3]);
            if (paths[i] > result) {
                result = paths[i];
            }
        }

        return result;

    }
}
