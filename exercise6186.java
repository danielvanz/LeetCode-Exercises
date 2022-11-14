public class exercise6186 {
    public static int[] smallestSubarrays(int[] nums) {

        int[] result = new int[nums.length];
        int[] maxSubArrays = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                maxSubArrays[i] |= nums[j];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            int subArray = 1;
            int or = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (or == maxSubArrays[i]) {
                    break;
                }
                or |= nums[j];
                subArray++;
            }
            result[i] = subArray;
        }

        return result;

    }

    public static void main(String[] args) {
        int[] nums = new int[] { 4, 0, 5, 6, 3, 2 };
        System.out.println(smallestSubarrays(nums));
    }
}
