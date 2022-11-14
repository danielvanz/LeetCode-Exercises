import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class exercise815 {

    class busTry {
        int currentBus;
        int attempts;

        busTry(int currentBus, int attempts) {
            this.currentBus = currentBus;
            this.attempts = attempts;
        }
    }

    public int numBusesToDestination(int[][] routes, int source, int target) {

        ArrayList<HashSet<Integer>> list = new ArrayList<>();
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        ArrayDeque<busTry> q = new ArrayDeque<>();

        if (source == target) {
            return 0;
        }

        for (int i = 0; i < routes.length; i++) {
            for (int j : routes[i]) {
                if (map.containsKey(j)) {
                    HashSet<Integer> temp = map.get(j);
                    temp.add(i);
                    map.replace(j, temp);
                } else {
                    HashSet<Integer> temp = new HashSet<>();
                    temp.add(i);
                    map.put(j, temp);
                }
            }
        }

        ArrayList<Integer> toDelete = new ArrayList<>();
        for (int i : map.keySet()) {
            if (map.get(i).size() == 1) {
                toDelete.add(i);
            }
        }

        for (int i = 0; i < toDelete.size(); i++) {
            map.remove(toDelete.get(i));
        }

        for (int i = 0; i < routes.length; i++) {
            HashSet<Integer> temp = new HashSet<>();
            for (int j : routes[i]) {
                temp.add(j);
            }
            list.add(temp);
        }

        // Initialize
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(source)) {
                q.add(new busTry(i, 1));
                if (list.get(i).contains(target)) {
                    return 1;
                }
            }
        }
        map.remove(source); // New

        // bfs
        while (q.size() > 0) {
            busTry b = q.poll();

            if (list.get(b.currentBus).contains(target)) {
                return b.attempts;
            }

            for (int i : list.get(b.currentBus)) {
                if (map.containsKey(i)) {
                    for (int j : map.get(i)) {
                        if (b.currentBus != j) {
                            q.add(new busTry(j, b.attempts + 1));
                        }
                    }
                    map.remove(i);
                }
            }

        }

        return -1;

    }
}
