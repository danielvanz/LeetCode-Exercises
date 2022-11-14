import java.util.HashMap;
import java.util.Map;

public class exercise383 {
    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<String, Integer> magazineMap = new HashMap<>();
        Map<String, Integer> ransomNoteMap = new HashMap<>();
        boolean canConstruct = true;

        for (int i = 0; i < magazine.length(); i++) {

            String substring = magazine.substring(i, i + 1);

            if (magazineMap.containsKey(substring)) {
                magazineMap.replace(substring, magazineMap.get(substring) + 1);
            } else {
                magazineMap.put(substring, 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {

            String substring = ransomNote.substring(i, i + 1);

            if (ransomNoteMap.containsKey(substring)) {
                ransomNoteMap.replace(substring, ransomNoteMap.get(substring) + 1);
            } else {
                ransomNoteMap.put(substring, 1);
            }
        }

        for (String i : ransomNoteMap.keySet()) {

            System.out.println(magazineMap.containsKey(i));
            if (magazineMap.containsKey(i)) {
                if (magazineMap.get(i) < ransomNoteMap.get(i)) {
                    canConstruct = false;
                }
            } else {
                canConstruct = false;
            }
        }

        return canConstruct;

    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aab", "aab"));
    }

}
