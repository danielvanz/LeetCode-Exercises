public class exercise334 {
    public static boolean increasingTriplet(int[] nums) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= first) {
                first = n;
            } else if (n <= second) {
                second = n;
            } else {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 5, 0, 4, 1, 3 };

        System.out.println(increasingTriplet(nums));
    }
}
