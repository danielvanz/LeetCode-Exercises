import java.util.HashMap;
import java.util.Hashtable;

public class exercise136 {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> table = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!table.containsKey(nums[i])) {
                table.put(nums[i], 1);
            } else {
                table.replace(nums[i], table.get(nums[i]) + 1);
            }
        }

        for (int i : table.keySet()) {
            if (table.get(i) == 1) {
                return i;
            }
        }

        return -1;

    }
}
