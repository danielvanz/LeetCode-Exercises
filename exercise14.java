import java.util.ArrayList;
import java.util.HashSet;

public class exercise14 {
    public static String longestCommonPrefix(String[] strs) {

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals("")) {
                return "";
            }
        }

        String first = strs[0];
        ArrayList<Boolean> list = new ArrayList<>();

        for (int i = 1; i < strs.length; i++) {
            for (int j = strs[i].length(); j > 0; j--) {
                if (first.startsWith(strs[i].substring(0, j))) {
                    first = strs[i].substring(0, j);
                    list.add(true);
                    break;
                }
            }
        }
        if (list.size() == strs.length - 1) {
            return first;
        }

        return "";

    }

    public static void main(String[] args) {
        String[] strings = new String[] { "flow", "flowerientje", "fsdfg" };
        System.out.println(longestCommonPrefix(strings));

    }
}
