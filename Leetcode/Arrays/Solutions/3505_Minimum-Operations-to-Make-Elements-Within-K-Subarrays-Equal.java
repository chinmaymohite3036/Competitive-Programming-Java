class Solution {
    public long minOperations(int[] nums, int x, int k) {
        int n = nums.length;
        long[] cost = new long[n - x + 1];
        
        TreeSet<Integer> lower = new TreeSet<>((a, b) -> {
            if (nums[a] != nums[b]) return Integer.compare(nums[a], nums[b]);
            return Integer.compare(a, b);
        });
        TreeSet<Integer> upper = new TreeSet<>((a, b) -> {
            if (nums[a] != nums[b]) return Integer.compare(nums[a], nums[b]);
            return Integer.compare(a, b);
        });
        
        long lowerSum = 0;
        long upperSum = 0;
        
        for (int i = 0; i < n; i++) {
            if (lower.isEmpty() || nums[i] <= nums[lower.last()]) {
                lower.add(i);
                lowerSum += nums[i];
            } else {
                upper.add(i);
                upperSum += nums[i];
            }
            
            if (i >= x) {
                int outIdx = i - x;
                if (lower.contains(outIdx)) {
                    lower.remove(outIdx);
                    lowerSum -= nums[outIdx];
                } else {
                    upper.remove(outIdx);
                    upperSum -= nums[outIdx];
                }
            }
            
            while (lower.size() < upper.size()) {
                int move = upper.first();
                upper.remove(move);
                upperSum -= nums[move];
                lower.add(move);
                lowerSum += nums[move];
            }
            while (lower.size() > upper.size() + 1) {
                int move = lower.last();
                lower.remove(move);
                lowerSum -= nums[move];
                upper.add(move);
                upperSum += nums[move];
            }
            
            if (i >= x - 1) {
                long median = nums[lower.last()];
                cost[i - x + 1] = (median * lower.size() - lowerSum) + (upperSum - median * upper.size());
            }
        }
        
        long[][] dp = new long[k + 1][n + 1];
        long INF = 1_000_000_000_000_000L;
        
        for (int j = 1; j <= k; j++) {
            Arrays.fill(dp[j], INF);
        }
        
        for (int j = 1; j <= k; j++) {
            for (int i = 1; i <= n; i++) {
                dp[j][i] = dp[j][i - 1]; 
                
                if (i >= x) {
                    long currentCost = cost[i - x];
                    if (dp[j - 1][i - x] != INF) {
                        dp[j][i] = Math.min(dp[j][i], dp[j - 1][i - x] + currentCost);
                    }
                }
            }
        }
        
        return dp[k][n] >= INF ? -1 : dp[k][n];
    }
}