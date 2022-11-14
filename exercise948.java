import java.util.Arrays;

public class exercise948 {
    public static int bagOfTokensScore(int[] tokens, int power) {

        Arrays.sort(tokens);
        int leftIndex = 0;
        int rightIndex = tokens.length - 1;
        int score = 0;

        while (leftIndex <= rightIndex) {

            if (power >= tokens[leftIndex]) {
                power -= tokens[leftIndex];
                score++;
                leftIndex++;
            } else if (score > 0 && leftIndex != rightIndex) {
                power += tokens[rightIndex];
                score--;
                rightIndex--;
            } else {
                break;
            }

        }

        return score;

    }

    public static void main(String[] args) {
        int[] array = new int[] { 100 };
        int power = 50;
        System.out.println(bagOfTokensScore(array, power));
    }
}
