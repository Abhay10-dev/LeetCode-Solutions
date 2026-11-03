class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;

        int i = 1;
        while(i < nums.length){
            int val = Math.min(nums[i], nums[i-1]);

            sum = sum + val;
            i += 2;
        }

        return sum;
    }
}