public class exercise6158 {
    public static String shiftingLetters(String s, int[][] shifts) {

        int[] chars = new int[s.length()];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = s.charAt(i) - 'a';
        }

        for (int i = 0; i < shifts.length; i++) {

            for (int j = shifts[i][0]; j <= shifts[i][1]; j++) {

                if (shifts[i][2] == 1) {
                    chars[j] = chars[j] + 1;
                } else {
                    chars[j] = chars[j] - 1;
                }

                if (chars[j] < 0) {
                    chars[j] = chars[j] + 26;
                } else if (chars[j] >= 26) {
                    chars[j] = chars[j] - 26;
                }

            }

        }

        String result = "";

        for (int i = 0; i < chars.length; i++) {
            String temp = Character.toString((char) (chars[i] + 'a'));
            result = result + temp;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] shifts = new int[][] { { 0, 1, 0 }, { 1, 2, 1 }, { 0, 2, 1 } };
        String string = "abc";

        System.out.println(shiftingLetters(string, shifts));
    }
}
