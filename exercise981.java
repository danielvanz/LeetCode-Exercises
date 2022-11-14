import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class exercise981 {

    HashMap<String, ArrayList<Timestamp>> map;

    class Timestamp {
        String value;
        int timestamp;

        Timestamp(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    public exercise981() {
        map = new HashMap<>();

    }

    public void set(String key, String value, int timestamp) {
        if (map.containsKey(key)) {
            ArrayList<Timestamp> list = map.get(key);
            list.add(new Timestamp(value, timestamp));
            map.replace(key, list);
        } else {
            ArrayList<Timestamp> list = new ArrayList<>();
            list.add(new Timestamp(value, timestamp));
            map.put(key, list);
        }
    }

    public String get(String key, int timestamp) {

        if (!map.containsKey(key)) {
            return "";
        }

        ArrayList<Timestamp> list = map.get(key);

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).timestamp <= timestamp) {
                return list.get(i).value;
            }
        }

        return "";

    }
}