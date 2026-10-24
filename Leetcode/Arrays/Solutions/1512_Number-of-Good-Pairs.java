class Solution {
    public int numIdenticalPairs(int[] nums) {
         int[] counts = new int[101];
        int goodPairs = 0;
        
        for (int num : nums) {
            counts[num]++;
        }
        
        for (int count : counts) {
            if (count > 1) {
                goodPairs += (count * (count - 1)) / 2;
            }
        }
        
        return goodPairs;
    }
}