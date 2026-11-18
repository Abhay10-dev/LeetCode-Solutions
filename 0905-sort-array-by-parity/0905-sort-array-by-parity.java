class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        while(left < right){

            if((nums[left] & 1) != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                right--;

            } else {
                left++;
            }
        }

        return nums;
    }
}