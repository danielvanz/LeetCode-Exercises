import java.util.Stack;

public class exercise20 {
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        char[] chars = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        if (chars[0] == ')' || chars[0] == '}' || chars[0] == ']') {
            return false;
        }

        stack.push(chars[0]);

        for (int i = 1; i < chars.length; i++) {

            if (!stack.empty()) {
                if (stack.peek() == '{' && chars[i] == '}') {
                    stack.pop();
                } else if (stack.peek() == '(' && chars[i] == ')') {
                    stack.pop();
                } else if (stack.peek() == '[' && chars[i] == ']') {
                    stack.pop();
                } else if ((stack.peek() == '[' || stack.peek() == '(' || stack.peek() == '{') &&
                        (chars[i] == '[' || chars[i] == '(' || chars[i] == '{')) {
                    stack.push(chars[i]);
                } else {
                    return false;
                }

            } else {
                if (chars[i] == ')' || chars[i] == '}' || chars[i] == ']') {
                    return false;
                }

                stack.push(chars[i]);
            }

        }

        if (stack.empty()) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        String s = "([]{]})";
        System.out.println(isValid(s));
    }
}
