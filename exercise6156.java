public class exercise6156 {
    public static int minimumRecolors(String blocks, int k) {

        char[] chars = new char[blocks.length()];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = blocks.charAt(i);
        }

        if (blocks.length() == k) {

            int recolors = 0;

            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == 'W') {
                    recolors++;
                }
            }
            return recolors;
        }

        if (k == 1) {
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == 'B') {
                    return 0;
                }
            }
            return 1;
        }

        int minRecolors = Integer.MAX_VALUE;

        for (int i = 0; i < chars.length - k + 1; i++) {
            int recolors = 0;
            for (int j = i; j < i + k; j++) {
                if (chars[j] == 'W') {
                    recolors++;
                }
            }
            minRecolors = Math.min(minRecolors, recolors);
        }

        return minRecolors;

    }

    public static void main(String[] args) {
        String blocks = "WBWBBBW";
        int k = 2;

        System.out.println(minimumRecolors(blocks, k));
    }
}