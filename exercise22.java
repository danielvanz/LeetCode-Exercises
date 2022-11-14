import java.util.ArrayList;
import java.util.List;

public class exercise22 {
    public List<String> generateParenthesis(int n) {

        ArrayList<String> a = getParentheses("", n, n, new ArrayList<>());

    }

    private void getParentheses(String p, int l, int r, ArrayList<String> results) {

        if (l == 0 && r == 0) {

            for (int i = 0; i < array.length; i++) {

            }
            return;
        }

        if (l > 0) {
            p = p + "(";
            l--;
            getParentheses(p, l, r, results);
        }
        if (r > 0) {
            p = p + ")";
            r--;
            getParentheses(p, l, r, results);
        }

        return;
    }
}
