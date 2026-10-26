class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        int zeroCount = 0, oneCount= 0, twoCount = 0;

        for(int i=0; i < n; i++){
            if(nums[i] == 0){
                zeroCount++;
            } else if(nums[i] == 1){
                oneCount++;
            } else {
                twoCount++;
            }
        } 

        for(int i=0; i < n; i++){
            if(zeroCount > 0){
                nums[i] = 0;
                zeroCount--;
            } else if(oneCount > 0){
                nums[i] = 1;
                oneCount--;
            } else {
                nums[i] = 2;
                twoCount--;
            }
        }
    }
}