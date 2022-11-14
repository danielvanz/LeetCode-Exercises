import java.util.ArrayList;

public class Fibonacci {

    static ArrayList<Integer> numbers = new ArrayList<>();
    public static void main(String[] args) {
        
        int input = 38;

        calculateFibonacci(input);

    }
    private static void calculateFibonacci(int input) {

        numbers.add(0);
        numbers.add(1);

        for (int i = 2; i <= input; i++) {
            numbers.add(numbers.get(i - 2) + numbers.get(i -1));
        }

        System.out.println(numbers.get(numbers.size() -1));

    }
}