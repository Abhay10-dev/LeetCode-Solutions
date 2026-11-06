class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;

        for(int i=0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
        }

        for(int num : nums){
            if(num == max) continue;

            if(num*2 > max){
                return -1;
            }
        }

        return maxIndex;
    }
}