class Solution {
    public int maximumGap(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        if(nums.length == 1) return 0;

        Arrays.sort(nums);

        int maxGap = 0;

        for(int i=nums.length-1; i > 0; i--){
            if(nums[i] != nums[i-1]){
                maxGap = Math.max(maxGap, nums[i]-nums[i-1]);
            } 
        }

        

        return maxGap;
    }
}