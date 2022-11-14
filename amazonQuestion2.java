import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class amazonQuestion2 {
    public static List<String> implementAPI(List<String> logs) {

        HashMap<String, String> registeredUsers = new HashMap<>();
        HashMap<String, String> loggedInUsers = new HashMap<>();
        ArrayList<String> response = new ArrayList<>();

        for (int i = 0; i < logs.size(); i++) {

            String[] log = logs.get(i).split(" ");
            String request = log[0];
            String username = log[1];
            String password = "";
            if (log.length == 3) {
                password = log[2];
            }

            if (request.equals("register")) {

                if (!registeredUsers.containsKey(username)) {
                    registeredUsers.put(username, password);
                    response.add("Registered Successfully");
                } else {
                    response.add("Username already exists");
                }

            } else if (request.equals("login")) {

                if (registeredUsers.containsKey(username) && registeredUsers.get(username).equals(password)
                        && !loggedInUsers.containsKey(username)) {
                    loggedInUsers.put(username, password);
                    response.add("Logged In Successfully");
                } else {
                    response.add("Login Unsuccessful");
                }

            } else {

                if (loggedInUsers.containsKey(username)) {
                    loggedInUsers.remove(username);
                    response.add("Logged Out Successfully");
                } else {
                    response.add("Logout Unsuccessful");
                }

            }

        }

        return response;

    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("register david david123");

        implementAPI(list);

    }

}
