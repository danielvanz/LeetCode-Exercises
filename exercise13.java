public class exercise13 {
    public static int romanToInt(String s) {

        char[] c = s.toCharArray();
        boolean concatinated = false;
        int result = 0;

        for (int i = 0; i < c.length; i++) {
            concatinated = false;
            if ((c[i] == 'I' || c[i] == 'X' || c[i] == 'C') && i < c.length - 1) {
                if (c[i] == 'I' && c[i + 1] == 'V') {
                    result += 4;
                    concatinated = true;
                } else if (c[i] == 'I' && c[i + 1] == 'X') {
                    result += 9;
                    concatinated = true;
                } else if (c[i] == 'X' && c[i + 1] == 'L') {
                    result += 40;
                    concatinated = true;
                } else if (c[i] == 'X' && c[i + 1] == 'C') {
                    result += 90;
                    concatinated = true;
                } else if (c[i] == 'C' && c[i + 1] == 'D') {
                    result += 400;
                    concatinated = true;
                } else if (c[i] == 'C' && c[i + 1] == 'M') {
                    result += 900;
                    concatinated = true;
                }
                if (concatinated) {
                    i++;
                }
            }
            if (!concatinated) {
                if (c[i] == 'I') {
                    result++;
                } else if (c[i] == 'V') {
                    result += 5;
                } else if (c[i] == 'X') {
                    result += 10;
                } else if (c[i] == 'L') {
                    result += 50;
                } else if (c[i] == 'C') {
                    result += 100;
                } else if (c[i] == 'D') {
                    result += 500;
                } else if (c[i] == 'M') {
                    result += 1000;
                }
            }
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }
}