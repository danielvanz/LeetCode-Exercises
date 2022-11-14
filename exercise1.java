import java.util.HashMap;

public class exercise1 {
    public static int[] twoSum(int[] nums, int target) {

        int[] array = new int[2];

        // for (int i = 0; i < nums.length; i++) {
        // for (int j = 0; j < nums.length; j++) {
        // if ((nums[i] + nums[j] == target) && (i != j)) {

        // array[0] = i;
        // array[1] = j;

        // return array;
        // }
        // }
        // }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                array[0] = i;
                array[1] = map.get(target - nums[i]);
                return array;
            } else {
                map.put(nums[i], i);
            }
        }

        return array;

    }

    public static void main(String[] args) {
        int[] testArray = new int[] { 3, 2, 4 };
        int target = 6;

        int[] resultArray = twoSum(testArray, target);
        System.out.print(resultArray[0]);
        System.out.print(" " + resultArray[1]);

    }
}
