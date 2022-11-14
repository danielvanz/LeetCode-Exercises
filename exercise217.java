import java.util.Hashtable;

public class exercise217 {
    public static boolean containsDuplicate(int[] nums) {

        Hashtable<Integer, Integer> hashtable = new Hashtable<>();

        for (int i : nums) {
            if (!hashtable.containsKey(i)) {
                hashtable.put(i, 1);
            } else {
                return true;
                // hashtable.replace(i, hashtable.get(i) + 1);
            }
        }

        // for (int i : hashtable.keySet()) {
        // if (hashtable.get(i) >= 2) {
        // return true;
        // }
        // }

        return false;

    }

    public static void main(String[] args) {
        int[] array = new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

        System.out.println(containsDuplicate(array));
    }

}
