import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class exercise49 {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashSet<Integer> indeces = new HashSet<>();
        HashMap<Character, String> chars = new HashMap<>();
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        String[] strsSort = new String[strs.length];

        for (int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            strsSort[i] = new String(temp);
        }

        String temp = strsSort[0];

        for (int i = 1; i < strs.length; i++) {
            if (strsSort[i].equals(temp)) {
                result.add(new ArrayList<>());
                ArrayList<String> tempArray = result.get(result.size() - 1);
                tempArray.add(strs[i]);
            }
        }

    }
}
