public class exercise1328 {
    public String breakPalindrome(String palindrome) {

        char[] c = palindrome.toCharArray();
        char[] all = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        boolean changed = false;

        for (int i = 0; i < c.length; i++) {
            if (c[i] != 'a') {
                if (!((i == ((c.length - 1) / 2)) && c.length % 2 == 1)) {
                    c[i] = 'a';
                    changed = true;
                    break;
                }
            }
        }

        if (!changed) {
            outerloop: for (int i = c.length - 1; i > 0; i--) {
                for (int j = 0; j < all.length; j++) {
                    if (all[j] > c[i]) {
                        if (!((i == ((c.length - 1) / 2)) && c.length % 2 == 1)) {
                            c[i] = all[j];
                            changed = true;
                            break outerloop;
                        }
                    }
                }
            }
        }

        if (changed) {
            String string = new String(c);
            return string;
        }

        return "";

    }

}
