class Solution {
    public int maximumWealth(int[][] accounts) {

        int maximum = 0;

        for (int i = 0; i < accounts.length; i++) {
            int totalCustomer = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                totalCustomer += accounts[i][j];

                if (maximum < totalCustomer) {
                    maximum = totalCustomer;
                }
            }
        }

        return maximum;
    }
}