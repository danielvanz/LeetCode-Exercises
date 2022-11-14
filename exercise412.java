import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> numbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                numbers.add("FizzBuzz");
            } else if (i % 3 == 0) {
                numbers.add("Fizz");
            } else if (i % 5 == 0) {
                numbers.add("Buzz");
            } else {
                numbers.add(i + "");
            }

        }
        return numbers;
    }
}