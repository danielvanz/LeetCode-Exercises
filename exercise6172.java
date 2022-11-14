public class exercise6172 {
    public static boolean isStrictlyPalindromic(int n) {

        for (int i = 2; i <= n - 2; i++) {

            String string = Integer.toString(n, i);

            if (!notPalindromic(string)) {
                return false;
            }
        }
        return true;
    }

    private static boolean notPalindromic(String string) {

        char[] chars = string.toCharArray();

        if (chars.length % 2 == 0) {

            int n = chars.length - 1;
            for (int i = 0; i < chars.length / 2; i++) {
                if (chars[i] != chars[n]) {
                    return false;
                }
                n--;
            }
            return true;

        } else {
            int n = chars.length - 1;
            for (int i = 0; i < (chars.length - 1) / 2; i++) {
                if (chars[i] != chars[n]) {
                    return false;
                }
            }
            return true;

        }
    }

    public static void main(String[] args) {
        // System.out.println(notPalindromic("10000000101"));
        System.out.println(isStrictlyPalindromic(1));
    }

}
