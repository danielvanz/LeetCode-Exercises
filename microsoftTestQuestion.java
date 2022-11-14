import java.util.HashSet;
import java.util.Hashtable;

public class microsoftTestQuestion {
    public boolean solution(int[] A) {

        HashSet<Integer> table = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            table.add(A[i]);
        }

        for (Integer integer : table) {
            if (table.contains(integer + 1) || table.contains(integer - 1)) {
                return true;
            }
        }

        return false;

    }
}
