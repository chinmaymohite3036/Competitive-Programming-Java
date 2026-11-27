class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        final int MAX_F = 1500;

        int[] freq = new int[MAX_F + 1];
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            freq[items[i][0]]++;
            if (items[i][1] < minPrice) {
                minPrice = items[i][1];
            }
        }

        int[] divCount = new int[MAX_F + 1];
        for (int f = 1; f <= MAX_F; f++) {
            if (freq[f] == 0) continue;
            for (int m = f; m <= MAX_F; m += f) {
                divCount[f] += freq[m];
            }
        }

        int[] dp = new int[budget + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            int price = items[i][1];
            if (price > budget) continue;

            int value = divCount[items[i][0]]; 
            for (int c = budget; c >= price; c--) {
                if (dp[c - price] != -1) {
                    int candidate = dp[c - price] + value;
                    if (candidate > dp[c]) {
                        dp[c] = candidate;
                    }
                }
            }
        }

        int maxTotal = 0;
        for (int c = 0; c <= budget; c++) {
            if (dp[c] != -1) {
                int total = dp[c] + (budget - c) / minPrice;
                if (total > maxTotal) {
                    maxTotal = total;
                }
            }
        }

        return maxTotal;
    }
}