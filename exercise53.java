public class exercise53 {

    public static int maxSubArray(int[] nums) {

        // int maxSum = Integer.MIN_VALUE;

        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i; j < nums.length; j++) {

        // int sum = 0;

        // for (int j2 = i; j2 <= j; j2++) {
        // sum = sum + nums[j2];
        // }

        // maxSum = Math.max(maxSum, sum);

        // }
        // }

        // int currentSum;
        // for (int i = 0; i < nums.length; i++) {
        // currentSum = 0;
        // for (int j = i; j < nums.length; j++) {
        // currentSum += nums[j];
        // maxSum = Math.max(maxSum, currentSum);
        // }
        // }

        int maxSum = nums[0];
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum += nums[i];
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] array = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(array));
    }
}
