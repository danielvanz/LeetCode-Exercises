import java.util.Date;

public class exercise6184 {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        String[] arriveA = arriveAlice.split("-");
        String[] leaveA = arriveAlice.split("-");
        String[] arriveB = arriveAlice.split("-");
        String[] leaveB = arriveAlice.split("-");

        Date dateArriveA = new Date(2021, Integer.valueOf(arriveA[0]), Integer.valueOf(arriveA[0]));
        Date dateleaveA = new Date(2021, Integer.valueOf(arriveA[0]), Integer.valueOf(arriveA[0]));
        Date datearriveB = new Date(2021, Integer.valueOf(arriveA[0]), Integer.valueOf(arriveA[0]));
        Date dateleaveB = new Date(2021, Integer.valueOf(arriveA[0]), Integer.valueOf(arriveA[0]));

    }
}
