public class exercise43 {
    public static String multiply(String num1, String num2) {

        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();

        int sum = 0;
        int mult1 = 1;
        int mult2 = 1;

        for (int i = chars1.length - 1; i >= 0; i--) {
            for (int j = chars2.length - 1; j >= 0; j--) {
                sum += Character.getNumericValue(chars1[i]) * Character.getNumericValue(chars2[j]) * mult1 * mult2;
                mult1 *= 10;
            }
            mult1 = 1;
            mult2 *= 10;
        }

        return Integer.toString(sum);

    }

    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));
    }
}
