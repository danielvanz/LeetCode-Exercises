import java.util.HashSet;

public class exercise202 {
    public static boolean isHappy(int n) {

        int result = n;
        String number = result + "";
        HashSet<Integer> set = new HashSet<>();

        while (result != 1) {

            int[] array = new int[number.length()];

            for (int i = 0; i < number.length(); i++) {
                array[i] = Integer.parseInt(number.substring(i, i + 1));
            }

            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] * array[i];
            }

            result = 0;

            for (int i = 0; i < array.length; i++) {
                result = result + array[i];
            }

            if (set.contains(result)) {
                return false;
            }
            number = result + "";
            set.add(result);
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
