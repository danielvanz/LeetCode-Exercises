import java.util.ArrayList;
import java.util.HashMap;

public class exercise387 {
    public static int firstUniqChar(String s) {

        char[] character = new char[s.length()];
        HashMap<Integer, Integer> indexAmount = new HashMap<>();
        HashMap<Character, Integer> charIndex = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            character[i] = s.charAt(i);
        }

        for (int i = 0; i < character.length; i++) {
            if (charIndex.containsKey(character[i])) {
                indexAmount.replace(charIndex.get(character[i]), indexAmount.get(charIndex.get(character[i])) + 1);
            } else {
                charIndex.put(character[i], i);
                indexAmount.put(i, 1);
            }
        }

        int lowestIndex = Integer.MAX_VALUE;

        for (int c : indexAmount.keySet()) {
            if (indexAmount.get(c) == 1) {
                lowestIndex = Math.min(lowestIndex, c);
            }
        }

        if (lowestIndex != Integer.MAX_VALUE) {
            return lowestIndex;
        }

        return -1;

    }

    public static void main(String[] args) {

        String test = "aabb";

        System.out.println(firstUniqChar(test));
    }
}
