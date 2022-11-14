import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class exercise350 {
    public static int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> table = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < nums1.length; i++) {
            if (table.containsKey(nums1[i])) {
                table.replace(nums1[i], table.get(nums1[i]) + 1);
            } else {
                table.put(nums1[i], 1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (table.containsKey(nums2[i]) && table.get(nums2[i]) >= 1) {
                arrayList.add(nums2[i]);
                table.replace(nums2[i], table.get(nums2[i]) - 1);
            }
        }

        int[] returnArray = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            returnArray[i] = arrayList.get(i);
        }

        return returnArray;

    }

    public static void main(String[] args) {
        int[] nums1 = new int[] { 4, 9, 5 };
        int[] nums2 = new int[] { 9, 4, 9, 8, 4 };

        int[] result = intersect(nums1, nums2);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

}
