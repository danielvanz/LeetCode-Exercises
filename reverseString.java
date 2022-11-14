public class reverseString {
    public void reverse(char[] s) {

        reverseIndex(0, s);

    }

    private void reverseIndex(int i, char[] s) {

        if (s == null || i >= s.length) {
            return;
        }

        reverseIndex(i + 1, s);

        System.out.print(s[i]);

    }
}
