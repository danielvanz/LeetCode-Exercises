public class exercise122 {
    public int maxProfit(int[] prices) {

        int buy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] > buy) {

            }
        }

    }
}
