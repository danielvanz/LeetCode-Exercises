import java.util.ArrayList;
import java.util.List;

public class imc1 {

    List<Integer> list;

    public imc1() {
        list = new ArrayList<>();
    }

    public void push(int v) {
        list.add(v);
    }

    public void pop() {
        list.remove(list.size() - 1);
    }

    public void inc(int i, int v) {
        for (int j = 0; j < i; j++) {
            list.set(j, list.get(j) + v);
        }
    }

    public boolean empty() {
        return list.isEmpty();
    }

    public int peek() {
        return list.get(list.size() - 1);
    }

    public long sum() {

        long sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int curInt = list.get(i);
            sum += Long.valueOf(curInt);
        }
        return sum;
    }

    public static void main(String[] args) {
        imc1 lol = new imc1();

        lol.push(1);
        lol.push(2);
        System.out.println(lol.sum());
    }

}
