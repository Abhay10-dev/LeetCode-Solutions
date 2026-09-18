class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 0) return -1;
        if(nums.length == 1) return nums[0];

        Arrays.sort(nums);

        int n = nums.length;
        int maxElement = nums[0];
        int currCount=1;
        int maxCount=1;


        for(int i=1; i<n; i++){
            if(nums[i] == nums[i-1]){
                currCount++;
            } else {
                currCount=1;
            } 
            
            if(currCount > maxCount){
                maxCount = currCount;
                maxElement = nums[i];
            }
        }

        return maxElement;
    }
}