public class exercise26 {
    public static int removeDuplicates(int[] nums) {

        int previous = nums[0];
        int toMove = 0;
        int moved = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == previous) {
                toMove++;
            } else {
                nums[i - toMove] = nums[i];
                moved++;
            }
            previous = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        return moved;

    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1 };
        System.out.println("Result: " + removeDuplicates(nums));
    }
}
