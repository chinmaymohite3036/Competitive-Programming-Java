class Solution {
    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;
        int low = 1, high = n, ans = n;

        long base = 1_000_000_007L;
        long[] pow = new long[n + 1];
        long[] hash = new long[n + 1];
        pow[0] = 1;
        for (int i = 0; i < n; i++) {
            pow[i + 1] = pow[i] * base;
            hash[i + 1] = hash[i] * base + (nums[i] * 0x9E3779B97F4A7C15L + 1);
        }

        long[] subHashes = new long[n];

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int count = n - mid + 1;

            for (int i = 0; i < count; i++) {
                subHashes[i] = hash[i + mid] - hash[i] * pow[mid];
            }

            Arrays.sort(subHashes, 0, count);

            boolean hasUnique = false;
            for (int i = 0; i < count; i++) {
                boolean sameLeft = (i > 0 && subHashes[i] == subHashes[i - 1]);
                boolean sameRight = (i + 1 < count && subHashes[i] == subHashes[i + 1]);
                if (!sameLeft && !sameRight) {
                    hasUnique = true;
                    break;
                }
            }

            if (hasUnique) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}