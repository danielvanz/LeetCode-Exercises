import java.util.ArrayList;

public class subsetPrinter {
    static void subsets(int n, int l, ArrayList<Integer> list) {

        if (list.size() == l) {
            System.out.print("(");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + ",");
            }
            System.out.print(")");
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                list.add(i);
                ArrayList<Integer> tempList = (ArrayList<Integer>) list.clone();
                subsets(n, l, tempList);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = 5;
        int l = 2;
        subsets(n, l, list);
    }
}
