import java.util.HashMap;

public class exercise2131 {
    public static int longestPalindrome(String[] words) {

        HashMap<String, Integer> map = new HashMap<>();
        int unpaired = 0;
        int score = 0;

        for (int i = 0; i < words.length; i++) {

            if (!map.containsKey(words[i])) {
                map.put(words[i], 0);
            }
            if (words[i].charAt(0) == words[i].charAt(1)) {
                if (map.get(words[i]) > 0) {
                    unpaired--;
                    map.replace(words[i], map.get(words[i]) - 1);
                    score += 4;
                } else {
                    unpaired--;
                    map.replace(words[i], map.get(words[i]) + 1);
                }
            } else {
                String reverse = "";
                reverse = words[i].substring(1, 2) + words[i].substring(0, 1);

                if (map.containsKey(reverse) && map.get(reverse) > 0) {
                    score += 4;
                    map.replace(reverse, map.get(reverse) - 1);
                } else
                    map.replace(words[i], map.get(words[i]) + 1);

            }

        }

        if (unpaired > 0) {
            score += 2;
        }

        return score;

    }

    public static void main(String[] args) {

        String[] words = new String[] { "nn", "nn", "hg", "gn", "nn", "hh", "gh", "nn", "nh", "nh" };

        System.out.println(longestPalindrome(words));
    }
}
