import java.util.TreeMap;

public class MyCalendarThree {

    TreeMap<Integer, Integer> map;

    public MyCalendarThree() {
        map = new TreeMap<>();
    }

    public int book(int start, int end) {
        map.put(start, map.getOrDefault(start, 0) + 1);
        map.put(end, map.getOrDefault(end, 0) - 1);

        int cur = 0;
        int max = 0;

        for (int i : map.values()) {
            System.out.println(i);
            cur += i;
            max = Math.max(cur, max);
        }

        return max;

    }
}
