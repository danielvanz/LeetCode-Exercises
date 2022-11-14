public class exercise6210 {
    public static int minimizeArrayValue(int[] nums) {

        int result = 0;

        while (true) {
            boolean changed = true;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[i - 1]) {

                    int diff = nums[i] - nums[i - 1];

                    if (diff % 2 == 1) {
                        nums[i] -= (diff / 2);
                        nums[i - 1] += diff / 2;
                        changed = false;
                    } else {
                        nums[i] -= diff / 2;
                        nums[i - 1] += diff / 2;
                        changed = false;
                    }

                    if (diff == 1) {
                        nums[i]--;
                        nums[i - 1]++;
                    }
                }
            }
            if (changed) {
                int max = Integer.MIN_VALUE;
                for (int i = 0; i < nums.length; i++) {
                    if (max < nums[i]) {
                        max = nums[i];
                    }
                }
                return max;
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = new int[] { 6, 9, 3, 8, 14 };
        System.out.println(minimizeArrayValue(nums));
    }
}
