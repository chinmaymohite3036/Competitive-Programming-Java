class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long c1 = cost1;
        long c2 = cost2;
        long cBoth = costBoth;
        long n1 = need1;
        long n2 = need2;
        
        long[] candidateK = {0L, n1, n2};
        long minTotalCost = Long.MAX_VALUE;
        
        for (long k : candidateK) {
            long currentCost = k * cBoth 
                             + Math.max(0L, n1 - k) * c1 
                             + Math.max(0L, n2 - k) * c2;
            minTotalCost = Math.min(minTotalCost, currentCost);
        }
        
        return minTotalCost;
    }
}