import java.util.HashMap;

public class exercise242 {
    public static boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        for (int i = 0; i < charS.length; i++) {
            if (map.containsKey(charS[i])) {
                map.replace(charS[i], map.get(charS[i]) + 1);
            } else {
                map.put(charS[i], 1);
            }
        }

        for (int i = 0; i < charT.length; i++) {
            if (map.containsKey(charT[i])) {
                map.replace(charT[i], map.get(charT[i]) - 1);
            } else {
                return false;
            }
        }

        for (char c : map.keySet()) {
            if (map.get(c) != 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        String s = "aacc";
        String t = "ccac";

        System.out.println(isAnagram(s, t));
    }
}
