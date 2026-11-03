class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;

        if(n == 1) return 0;

        int maxValue = Integer.MIN_VALUE;
        int totalSum = 0;

        for(int i=0; i < n; i++){
            totalSum += nums[i];

            if(maxValue < nums[i]){
                maxValue = nums[i];
            }
        }

        return (maxValue*n)-totalSum;
    }
}