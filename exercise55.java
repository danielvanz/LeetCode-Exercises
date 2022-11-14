public class exercise55 {
    public static boolean canJump(int[] nums) {

        int[] result = new int[nums.length];
        int maxAvailable = 0;

        if (nums.length == 1 && nums[0] == 0) {
            return true;
        }

        for (int i = 0; i < nums.length; i++) {
            maxAvailable--;
            if (nums[i] > maxAvailable) {
                maxAvailable = nums[i];
                result[i] = maxAvailable;
            } else {
                result[i] = maxAvailable;
            }

            if (result[i] < 1) {
                break;
            }
        }

        if (result[nums.length - 2] > 0) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        int[] nums = new int[] { 3, 2, 1, 0, 4 };
        System.out.println(canJump(nums));
    }
}
