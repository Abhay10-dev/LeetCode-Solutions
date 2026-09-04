class Solution {
    public int firstStableIndex(int[] nums, int k) {

        if(nums==null || nums.length == 0) return -1;
        if(nums.length == 1) return 0;

        int n = nums.length;

        int[] suffMin = new int[n];
        suffMin[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--){
            suffMin[i] = Math.min(suffMin[i+1], nums[i]);
        }


        int preMax = nums[0];
        for(int i=0; i<n; i++){

            preMax = Math.max(preMax, nums[i]);
            
            if(preMax-suffMin[i] <= k){
                return i;
            }
        }

        return -1;
    }
}