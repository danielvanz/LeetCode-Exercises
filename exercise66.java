public class exercise66 {
    public static int[] plusOne(int[] digits) {

        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1]++;
            return digits;
        }

        boolean hasCarry = true;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (hasCarry) {
                digits[i]++;
            }
            if (digits[i] > 9) {
                digits[i] = 0;
                hasCarry = true;
            } else {
                hasCarry = false;
            }
        }

        if (!hasCarry) {
            return digits;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        for (int i = 1; i < result.length; i++) {
            result[i] = digits[i - 1];
        }

        return result;

    }

    public static void main(String[] args) {
        int[] digits = new int[] { 1, 4, 5, 6, 7, 8, 9, 0, 5, 3 };
        int[] result = plusOne(digits);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
    }
}
