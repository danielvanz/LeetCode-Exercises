import java.util.ArrayList;
import java.util.List;

public class exercise78 {
    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> numsList = new ArrayList<>();
        ArrayList<Integer> entry = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int i = 0; i < nums.length; i++) {
            numsList.add(nums[i]);
        }

        implementation(numsList, result, entry);

        return result;

    }

    private static void implementation(ArrayList<Integer> numsList, List<List<Integer>> result,
            ArrayList<Integer> entry) {

        if (numsList.isEmpty()) {
            return;
        } else {
            ArrayList<Integer> temp = (ArrayList<Integer>) numsList.clone();
            for (int i = 0; i < numsList.size(); i++) {
                int pull = temp.get(0);
                entry.add(pull);
                if (!result.contains(entry)) {
                    result.add(entry);
                }
                temp.remove(0);
                ArrayList<Integer> newNumList = (ArrayList<Integer>) temp.clone();
                ArrayList<Integer> toAdd = (ArrayList<Integer>) entry.clone();
                implementation(newNumList, result, toAdd);
                temp.add(pull);
            }
        }

        return;

    }

    public static void main(String[] args) {

        int[] nums = new int[] { 1, 2, 3 };
        System.out.println(subsets(nums));
    }
}