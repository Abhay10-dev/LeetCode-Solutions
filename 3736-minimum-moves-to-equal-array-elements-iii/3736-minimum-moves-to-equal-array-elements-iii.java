class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int minCount = 0;

        for(int i=0; i < nums.length; i++){

            while(nums[i] != nums[n-1]){
                nums[i] += 1;
                minCount++;
            }

        }

        return minCount;
    }
}