import java.util.Hashtable;

public class exercise121 {
    public static int maxProfit(int[] prices) {

        int buy = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] - buy > maxProfit) {
                maxProfit = prices[i] - buy;
            }

            if (buy > prices[i]) {
                buy = prices[i];
            }

        }

        return maxProfit;

    }

    public static void main(String[] args) {

        System.out.println(maxProfit(new int[] { 7, 6, 4, 3, 1 }));

    }

}
