class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] freq = new int[101];
        int totalElements = nums.length;
        
        for (int num : nums) {
            freq[num] += 1;
        }
        
        int[] ans = new int[totalElements];
        int idx = 0;
        
        while (totalElements > 0) {
            for (int i = 1; i <= 100; i++) {
                if (freq[i] > 0) {
                    ans[idx] = i;
                    freq[i] -= 1;
                    idx++;
                    totalElements--;
                }
            }
        }
        
        return ans;
    }
}