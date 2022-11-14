import java.util.HashMap;

public class exercise205 {
    public static boolean isIsomorphic(String s, String t) {

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        HashMap<Character, Character> map = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < tArray.length; i++) {
            if (map.containsKey(tArray[i]) && map.get(tArray[i]) == sArray[i]) {
                continue;
            } else if (map.containsKey(tArray[i])) {
                return false;
            } else {
                map.put(tArray[i], sArray[i]);
            }
        }

        return true;

    }

    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";

        System.out.println(isIsomorphic(s, t));
    }
}
