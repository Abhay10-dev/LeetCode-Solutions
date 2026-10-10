class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {

        int n = nums1.length;
        int maxDiff = 0;
        int[] count = new int[100001]; 
        
        for (int i = 0; i < n; i++) {
            int d = Math.abs(nums1[i] - nums2[i]);
            count[d]++;
            maxDiff = Math.max(maxDiff, d);
        }
        
        long k = (long) k1 + k2;

        for (int i = maxDiff; i > 0; i--) {
            if (count[i] == 0) continue;
          
            long reduce = Math.min(k, (long) count[i]);
            count[i] -= reduce;
            count[i - 1] += reduce;
            k -= reduce;
            
            if (k == 0) break;
        }

        long minSum = 0;
        for (int i = 0; i <= maxDiff; i++) {
            if (count[i] > 0) {
                minSum += (long) count[i] * i * i;
            }
        }
        
        return minSum;
    }
}