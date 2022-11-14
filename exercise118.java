import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

public class exercise118 {
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> resultList = new ArrayList<List<Integer>>();

        resultList.add(new ArrayList<Integer>());
        resultList.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevList = resultList.get(i - 1);
            resultList.add(new ArrayList<>());
            List<Integer> thisList = resultList.get(i);

            for (int j = 0; j < prevList.size() + 1; j++) {

                if (j == 0 || j == prevList.size()) {
                    thisList.add(1);
                } else {
                    thisList.add(prevList.get(j - 1) + prevList.get(j));
                }

            }

        }

        return resultList;

    }

    public static void main(String[] args) {
        System.out.println(generate(3));
    }

}
