public class microsoft2 {
    public static int solution(int[] blocks) {

        int[] leftMost = new int[blocks.length];
        int[] rightMost = new int[blocks.length];

        int curLeft = 0;
        leftMost[0] = 1;

        for (int i = 1; i < leftMost.length; i++) {
            if (blocks[i - 1] >= blocks[i]) {
                curLeft++;
            } else {
                curLeft = 1;
            }
            leftMost[i] = curLeft;
        }

        int curRight = 0;
        rightMost[rightMost.length - 1] = 1;

        for (int i = rightMost.length - 2; i >= 0; i--) {
            if (blocks[i + 1] >= blocks[i]) {
                curRight++;
            } else {
                curRight = 1;
            }
            rightMost[i] = curRight;
        }

        int result = 0;

        for (int i = 0; i < rightMost.length; i++) {
            if (rightMost[i] + leftMost[i] > result) {
                result = rightMost[i] + leftMost[i] - 1;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int[] blocks = new int[] { 1, 2, 3, 2, 1, 2, 3, 4, 1 };
        System.out.println(solution(blocks));
    }
}
