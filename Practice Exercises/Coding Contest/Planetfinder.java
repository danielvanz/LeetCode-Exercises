import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Planetfinder {

    private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    static String input;
    static String amountStars;
    static String inputClean;
    static String[] inputArray;
    static ArrayList<Integer> periodIndexStart = new ArrayList<>();
    static ArrayList<Integer> periodIndexEnd = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        
        //input = new String(Files.readAllBytes(Paths.get("level1-1.in")));
        //input = new String(Files.readAllBytes(Paths.get("level1-2.in")));
        input = new String(Files.readAllBytes(Paths.get("level1-3.in")));
        //input = new String(Files.readAllBytes(Paths.get("level1-4.in")));
        //input = new String(Files.readAllBytes(Paths.get("level1-5.in")));
        
        cleanInput();

        start();

    }

    private static void start() {
        String lastString = inputArray[1];
        String base = "";
        int repetitionCount = 0;
        int countSolar = 0;
        int countTransit = 0;
        boolean same = true;
        int periods = 0;
        int periodLength = 0;
        boolean transitHappened = false;

        for (int i = 0; i < inputArray.length; i++) {

            if (i == inputArray.length -1) {
                System.out.print(countSolar + " " + countTransit + " ");
            }

            if (!isNumeric(inputArray[i])) {
                if (i == 0) {
                    System.out.print(inputArray[i] + " ");
                }
                else{
                    // for (Integer string : periodIndex) {
                    //     System.out.println(string);
                    // }
                    // periodIndex.clear();
                    System.out.print(countSolar + " " + countTransit + " ");
                    System.out.print(inputArray[i] + " ");

                    countSolar = 0;
                    countTransit = 0;
    
                }
                
                // countSolar = 0;
                // countTransit = 0;
            }
            else if (isNumeric(inputArray[i]) && (!isNumeric(inputArray[i-1]))) {

            }
            else if (isNumeric(inputArray[i]) && (!isNumeric(inputArray[i-2]))) {
                base = inputArray[i];
                lastString = inputArray[i];
                repetitionCount = 1;

            }
            else if (lastString.equals(inputArray[i])){
                repetitionCount++;
            }
            else{

                if (Integer.parseInt(base) < Integer.parseInt(inputArray[i]) && same) {
                    countSolar++;
                    same = false;
                }
                else if ((Integer.parseInt(base) > Integer.parseInt(inputArray[i])) && same) {
                    if ((Integer.parseInt(base) - Integer.parseInt(inputArray[i])) >= Integer.parseInt(base) * 0.005) {
                        if (inputArray[i].equals(inputArray[i+1]) && inputArray[i+1].equals(inputArray[i+2]) && inputArray[i+2].equals(inputArray[i+3]) && inputArray[i+3].equals(inputArray[i+4])) {
                            periodIndexStart.add(i);
                            countTransit++;
                            same = false;
                            transitHappened = true;
                        }
                    }
                }

                // if (transitHappened && (!inputArray[i+1].equals(inputArray[i]))){
                //     periodIndexEnd.add(i);
                //     transitHappened = false;
                // }

                else{
                    if (transitHappened && (!inputArray[i+1].equals(inputArray[i]))){
                       periodIndexEnd.add(i);

                        transitHappened = false;
                    }
                    same = true;
                    lastString = inputArray[i];
                    repetitionCount = 1;
    
                }

                same = true;
                lastString = inputArray[i];
                repetitionCount = 1;
            }


        }
        System.out.println();
        System.out.println("Start");
        for (Integer string : periodIndexStart) {
                System.out.println(string);
        }
        System.out.println("End");
        for (Integer string : periodIndexEnd) {
            System.out.println(string);
    }


    }


    // private static int calculatePeriod(int i, String base) {

    //     int startIndex = i;
    //     boolean same = true;

    //     for (int j = i; j < inputArray.length; j++) {

    //         if (inputArray[i].equals(inputArray[j]) && same) {
                
    //         } 
    //         else if ((!inputArray[i].equals(inputArray[j])) && same) {
    //             same = false;
    //         }
    //         else {
    //             if ((Integer.parseInt(base) > Integer.parseInt(inputArray[i])) && same) {
    //                 if ((Integer.parseInt(base) - Integer.parseInt(inputArray[i])) >= Integer.parseInt(base) * 0.005) {
    //                     if (inputArray[i].equals(inputArray[i+1]) && inputArray[i+1].equals(inputArray[i+2]) && inputArray[i+2].equals(inputArray[i+3]) && inputArray[i+3].equals(inputArray[i+4])) {
    //                         System.out.println(i - startIndex);
    //                     }
    //                 }
    //             }
    //         }

    //        if ((Integer.parseInt(base) > Integer.parseInt(inputArray[i]))) {
    //             if ((Integer.parseInt(base) - Integer.parseInt(inputArray[i])) >= Integer.parseInt(base) * 0.005) {
    //                 if (inputArray[i].equals(inputArray[i+1]) && inputArray[i+1].equals(inputArray[i+2]) && inputArray[i+2].equals(inputArray[i+3]) && inputArray[i+3].equals(inputArray[i+4])) {
    //                     int poep = j - startIndex;
    //                     System.out.println("Hi : " + poep);
    //                     return j - startIndex;
    //                 }
    //             }
    //         }        
    //     }

    //     return 0;
    // }

    private static void cleanInput() {
        String[] inputString = input.split(" ", 2);
        amountStars = inputString[0];
        inputClean = inputString[1];
        inputArray = inputClean.split(" ");
    }


    private static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false; 
        }
        return pattern.matcher(strNum).matches();
    }
    
}