import java.util.ArrayList;
import java.util.List;

public class amazonPractice {
    public static List<Integer> performOperations(List<Integer> arr, List<List<Integer>> operations) {

        ArrayList<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < operations.size(); i++) {
            int start = operations.get(i).get(0);
            int end = operations.get(i).get(1);

            for (int j = end; j >= start; j--) {
                tempList.add(arr.get(j));
            }

            for (int j = start; j <= end; j++) {
                arr.set(j, tempList.get(0));
                tempList.remove(0);
            }
        }

        return arr;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        List<List<Integer>> operations = new ArrayList<>();
        operations.add(list1);
        list1.add(0);
        list1.add(2);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(performOperations(list, operations));

    }
}