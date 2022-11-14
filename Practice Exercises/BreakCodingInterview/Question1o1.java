public class Question1o1 {
    public static void main(String[] args) {
        String input = "heqips";

        if (isDuplicate(input)) {
            System.out.println("Not unique characters!");
        } else {
            System.out.println("Whole string is unique!");
        }
    }


    static boolean isDuplicate(String string){


        for (int i = 0; i < string.length() ; i++) { //minus 1?
            String letter = string.substring(i, i+1);
            for (int j = 0; j < string.length(); j++) { //minus 1?
                String letterDub = string.substring(j, j+1);

                if (letter.equals(letterDub) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
}
