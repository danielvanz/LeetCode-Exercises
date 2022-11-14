import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class amazonQuestion1 {
    public static List<Integer> findDataLocations(List<Integer> locations, List<Integer> movedFrom,
            List<Integer> movedTo) {

        HashSet<Integer> locationIndexes = new HashSet<>();
        ArrayList<Integer> newLocations = new ArrayList<>();

        for (int i = 0; i < locations.size(); i++) {
            locationIndexes.add(locations.get(i));
        }

        for (int i = 0; i < movedFrom.size(); i++) {
            locationIndexes.remove(movedFrom.get(i));
            locationIndexes.add(movedTo.get(i));
        }

        for (int i : locationIndexes) {
            newLocations.add(i);
        }

        Collections.sort(newLocations);

        return newLocations;

    }

}
