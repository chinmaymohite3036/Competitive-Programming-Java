class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxLen = 2; 
        
        final int MAX_BOUND = 25200;

        for (int i = 0; i < n; i++) {
            int prod = nums[i];
            int currentGcd = nums[i];
            int currentLcm = nums[i];

            for (int j = i + 1; j < n; j++) {
                prod *= nums[j];
                if (prod > MAX_BOUND) {
                    break;
                }

                currentGcd = gcd(currentGcd, nums[j]);
                currentLcm = (currentLcm * nums[j]) / gcd(currentLcm, nums[j]);

                if (prod == currentLcm * currentGcd) {
                    int len = j - i + 1;
                    if (len > maxLen) {
                        maxLen = len;
                    }
                }
            }
        }

        return maxLen;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}