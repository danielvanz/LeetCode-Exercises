import java.util.HashMap;

public class exercise409 {
    public int longestPalindrome(String s) {

        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int resultaat = 0;
        boolean secondTime = true;

        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], 1);
            } else {
                map.replace(chars[i], map.get(chars[i]) + 1);
            }
        }

        for (char c : map.keySet()) {
            if (map.get(c) % 2 == 0) {
                resultaat = resultaat + map.get(c);
            } else if (secondTime) {
                resultaat = resultaat + map.get(c);
                secondTime = false;
            } else {
                resultaat = resultaat + map.get(c) - 1;
            }
        }

        return resultaat;
    }
}