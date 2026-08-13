class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Check if current price is a new minimum
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate profit if selling today
            int currentProfit = prices[i] - minPrice;

            // Update maximum profit
            maxProfit = Math.max(currentProfit, maxProfit);
        }

        return maxProfit;
    }
}