class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        HashMap<Integer, Integer> dp = new HashMap<>();
        int maxLength = 0;

        for (int num : arr) {
            int count = dp.getOrDefault(num - difference, 0) + 1;
            
            dp.put(num, count);
            
            maxLength = Math.max(maxLength, count);
        }

        return maxLength;
    }
}