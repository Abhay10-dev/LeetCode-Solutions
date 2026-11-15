class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1_000_000_007;
        long totalOddSum = 0;
        
        int prefixSum = 0;
        int evenCount = 1; 
        int oddCount = 0;

        for (int num : arr) {
            prefixSum += num;

            if (prefixSum % 2 != 0) {
                totalOddSum = (totalOddSum + evenCount) % MOD;
                oddCount++;
            } else {
                totalOddSum = (totalOddSum + oddCount) % MOD;
                evenCount++;
            }
        }

        return (int) totalOddSum;
    }
}