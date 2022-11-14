public class exercise6208 {
    public static int countTime(String time) {

        String firstHour = time.substring(0, 1);
        String secondHour = time.substring(1, 2);

        String firstMinute = time.substring(3, 4);
        String secondMinute = time.substring(4, 5);

        int possibilities = 1;

        if (firstHour.equals("?")) {
            if (secondHour.equals(secondMinute)) {

            }
            possibilities *= 3;
        }
        if (secondHour.equals("?")) {
            possibilities *= 10;
        }
        if (firstMinute.equals("?")) {
            possibilities *= 6;
        }
        if (secondMinute.equals("?")) {
            possibilities *= 10;
        }

        return possibilities;

    }

    public static void main(String[] args) {
        System.out.println(countTime("?5:00"));
    }
}
