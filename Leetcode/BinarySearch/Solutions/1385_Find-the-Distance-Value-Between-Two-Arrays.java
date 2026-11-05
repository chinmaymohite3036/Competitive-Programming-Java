class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        .
        boolean[] hasValue = new boolean[2001];
        
        for (int val : arr2) {
            hasValue[val + 1000] = true;
        }
        
        int distanceValue = 0;
        
        for (int val : arr1) {
            boolean isValid = true;
            
            int start = Math.max(0, val - d + 1000);
            int end = Math.min(2000, val + d + 1000);
            
            for (int i = start; i <= end; i++) {
                if (hasValue[i]) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                distanceValue++;
            }
        }
        
        return distanceValue;
    }
}
