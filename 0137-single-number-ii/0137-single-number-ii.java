class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1) return nums[0];

        int ones=0, twos=0;

        for(int num : nums){
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }

        return ones;
    }
}