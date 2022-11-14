public class microsoft21 {
    public int solution(int[] blocks) {

        int buy = blocks[0];
        int maxProfit = 0;

        for (int i = 1; i < blocks.length; i++) {

            if (blocks[i] - buy > maxProfit) {
                maxProfit = blocks[i] - buy;
            }

            if (buy > blocks[i]) {
                buy = blocks[i];
            }

        }

        return maxProfit;

    }
}
