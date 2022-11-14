import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class exercise2007 {
    public static int[] findOriginalArray(int[] changed) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(changed);

        if (changed.length % 2 == 1) {
            return new int[] {};
        }

        for (int i = 0; i < changed.length; i++) {
            if (!map.containsKey(changed[i])) {
                map.put(changed[i], 1);
            } else {
                map.replace(changed[i], map.get(changed[i]) + 1);
            }
        }

        for (int i = 0; i < changed.length; i++) {
            if (map.containsKey(changed[i] * 2) && map.get(changed[i]) > 0 && map.get(changed[i] * 2) > 0) {
                map.replace(changed[i], map.get(changed[i]) - 1);
                map.replace(changed[i] * 2, map.get(changed[i] * 2) - 1);
                list.add(changed[i]);
            }
        }

        boolean mapIsEmpty = true;
        for (int integer : map.keySet()) {
            if (map.get(integer) > 0) {
                mapIsEmpty = false;
            }
        }

        if (mapIsEmpty) {
            int[] original = list.stream().mapToInt(i -> i).toArray();
            return original;
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 6, 8, 3, 4 };
        findOriginalArray(array);
    }
}
