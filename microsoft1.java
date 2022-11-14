import java.util.HashMap;
import java.util.HashSet;

public class microsoft1 {
    public int solution(String S) {

        HashSet<Character> set = new HashSet<>();
        char[] chars = S.toCharArray();
        int numberSubstrings = 1;

        for (int i = 0; i < chars.length; i++) {
            if (set.contains(chars[i])) {
                set.clear();
                numberSubstrings++;
            }
            set.add(chars[i]);
        }

        return numberSubstrings;

    }
}
