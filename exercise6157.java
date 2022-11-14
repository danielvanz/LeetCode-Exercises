public class exercise6157 {
    public static int secondsToRemoveOccurrences(String s) {

        int seconds = 0;
        String result = s;

        while (true) {
            if (result.contains("01")) {
                result = result.replace("01", "10");
                seconds++;
            } else {
                break;
            }
        }

        return seconds;

    }

    public static void main(String[] args) {
        String s = "11100";
        System.out.println(secondsToRemoveOccurrences(s));
    }

}
