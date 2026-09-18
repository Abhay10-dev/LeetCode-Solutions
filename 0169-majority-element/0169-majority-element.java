class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 0) return -1;
        if(nums.length == 1) return nums[0];

        int candidate = nums[0];
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
             
            if(num == candidate){
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}