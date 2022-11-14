import java.util.ArrayList;

public class exercise232 {

    ArrayList<Integer> list;

    public exercise232() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        int temp = list.get(list.size() - 1);
        list.remo
        return temp;
    }

    public int peek() {
        return list.get(list.size() - 1);
    }

    public boolean empty() {
        return list.isEmpty();
    }

}
