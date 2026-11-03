class Solution {
    public int minMoves(int[] nums) {
        if(nums.length == 1) return 0;

        int maxValue = 0;
        int totalSum = 0;

        for(int num : nums){

            totalSum += num;
            maxValue = Math.max(maxValue, num);

        }

        return (maxValue*nums.length)-totalSum;
    }
}