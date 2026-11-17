class Solution {
    public int minimumChanges(String s, int k) {
        int n = s.length();
        char[] chars = s.toCharArray();
        
        int[][] cost = new int[n][n];
        for (int[] row : cost) {
            Arrays.fill(row, n);
        }

        for (int d = 1; d <= n / 2; d++) {
            for (int rem = 0; rem < d; rem++) {

                int chainLen = (n - 1 - rem) / d + 1;
                if (chainLen < 2) continue;

                for (int center = 0; center < 2 * chainLen - 1; center++) {
                    int l = center / 2;
                    int r = (center + 1) / 2;
                    int mismatches = 0;

                    while (l >= 0 && r < chainLen) {
                        int idxL = rem + l * d;
                        int idxR = rem + r * d;
                        if (chars[idxL] != chars[idxR]) {
                            mismatches++;
                        }

                        l--;
                        r++;
                    }
                }
            }
        }
        
        for (int[] row : cost) Arrays.fill(row, n);
        
        for (int d = 1; d <= n / 2; d++) {
            for (int i = 0; i + 2 * d <= n; i++) {
                int changes = 0;
                for (int offset = 0; offset < d; offset++) {
                    if (chars[i + offset] != chars[i + d + offset]) {
                        changes++;
                    }
                }
                int j = i + 2 * d - 1;
                if (changes < cost[i][j]) cost[i][j] = changes;
                
                for (int len = 3 * d; i + len <= n; len += d) {
                    int end = i + len - 1;
                    int groupLen = len / d;
                    int totalChanges = 0;
                    for (int offset = 0; offset < d; offset++) {
                        int left = i + offset;
                        int right = end - d + 1 + offset;
                        while (left < right) {
                            if (chars[left] != chars[right]) totalChanges++;
                            left += d;
                            right -= d;
                        }
                    }
                    if (totalChanges < cost[i][end]) {
                        cost[i][end] = totalChanges;
                    }
                }
            }
        }

        int INF = 1_000_000;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0;

        for (int p = 1; p <= k; p++) {
            int[] nextDp = new int[n + 1];
            Arrays.fill(nextDp, INF);
            
            int maxI = n - 2 * (k - p);
            for (int i = 2 * p; i <= maxI; i++) {
                int best = INF;
                for (int m = 2 * (p - 1); m <= i - 2; m++) {
                    int val = dp[m] + cost[m][i - 1];
                    if (val < best) {
                        best = val;
                    }
                }
                nextDp[i] = best;
            }
            dp = nextDp;
        }

        return dp[n];
    }
}