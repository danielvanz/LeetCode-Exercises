import java.util.ArrayList;

public class DeletePrimes {

    static ArrayList<Integer> numbers = new ArrayList<>();
    static ArrayList<Integer> numbers1 = new ArrayList<>();

    static ArrayList<Integer> singleNumbers = new ArrayList<>();
    static int oldLength = 0;
    static int newLength = 0;

    static int times = 0;

    public static void main(String[] args) {
        start(46216567629137);

        
    }

    static void start(int n){

        if (!checkPrime(n)) {
            System.out.println("Not a Prime");
        }

        if (String.valueOf(n).length() == 1 && checkPrime(n)){
            singleNumbers.add(n);
            System.out.println(1);
        }
        else if (checkPrime(n)){
            System.out.println("Im here!");
            numbers.add(n);
            newLength = numbers.size();

            while (oldLength != newLength) {
                for (Integer integer : numbers) {
                    //System.out.println(integer);
                    System.out.println(singleNumbers.size());

                    cut(integer);
                }    
                numbers.clear();
                for (Integer integer : numbers1) {
                    //System.out.println(integer);
                    System.out.println(singleNumbers.size());

                    cut1(integer);
                }

            }

            System.out.println(singleNumbers.size());

            // for (Integer integer : singleNumbers) {
            //     System.out.println(integer);
            // }
        }
        
    }


    static void cut(int n){
        oldLength = numbers.size();
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            
            String number = n + "";
            number = number.substring(0, i) + number.substring(i+1);

            int number1 = Integer.parseInt(number);
            
            if(String.valueOf(number1).length() == 1 && checkPrime(number1)){
                singleNumbers.add(number1);
            }
            else if (checkPrime(number1)) {
                //System.out.println(number1);
                numbers1.add(number1);
            }
        }

        newLength = numbers.size();

    }

    static void cut1(int n){
        oldLength = numbers.size();
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            
            String number = n + "";
            number = number.substring(0, i) + number.substring(i+1);

            int number1 = Integer.parseInt(number);
            
            if(String.valueOf(number1).length() == 1 && checkPrime(number1)){
                singleNumbers.add(number1);
            }
            else if (checkPrime(number1)) {
                //System.out.println(number1);
                numbers.add(number1);
            }
        }

        newLength = numbers.size();

    }

    static boolean checkPrime(int n){
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
    
}