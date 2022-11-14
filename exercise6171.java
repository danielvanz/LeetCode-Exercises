import java.util.HashMap;

public class exercise6171 {
    public static boolean findSubarrays(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if (map.containsKey(nums[i] + nums[i + 1])) {
                return true;
            } else {
                map.put(nums[i] + nums[i + 1], i);
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(findSubarrays(array));
    }
}
