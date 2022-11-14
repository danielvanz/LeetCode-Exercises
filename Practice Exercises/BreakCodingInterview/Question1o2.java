import java.util.ArrayList;

public class Question1o2 {

    static ArrayList<String> string1 = new ArrayList<>();
    static ArrayList<String> string2 = new ArrayList<>();
   public static void main(String[] args) {
       String input1 = "hello";
       String input2 = "lloeh";
       
       fillArrayLists(input1, input2);
       checkPermutation();
   }

private static void fillArrayLists(String input1, String input2) {

    if (input1.length() < input2.length()) {
        System.out.println("Permutation is bigger!!!");
    }

    int[] letters = new int[128];
    letters[input1.charAt(1)]++;

    for (int i = 0; i < input1.length(); i++) {
        string1.add(input1.substring(i, i+1));
        string2.add(input2.substring(i, i+1));
    }
}


private static void checkPermutation() {
        for (int i = 0; i < string1.size(); i++) {
            if (!string2.contains(string1.get(i))) {
                
            }
        }

    } 
}
