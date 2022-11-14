public class exercise393 {
    public static boolean validUtf8(int[] data) {

        String[] array = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            array[i] = Integer.toBinaryString(data[i]);
        }

        if (data.length == 1 && array[0].substring(0, 1).equals("0") && array[0].length() == 8) {
            return true;
        } else if (array[0].substring(0, data.length).matches("1{" + data.length + "}") && array[0].substring(
                data.length, data.length + 1).equals("0") && array[0].length() == 8) {
            return isCorrect(array);
        } else {
            return false;
        }

    }

    private static boolean isCorrect(String[] array) {

        for (int i = 1; i < array.length; i++) {
            if (!(array[i].length() == 8 && array[i].substring(0, 2).equals("10"))) {
                return false;
            }
        }

        return true;
    }
}
