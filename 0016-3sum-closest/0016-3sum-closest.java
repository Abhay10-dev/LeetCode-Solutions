class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int result=nums[0] + nums[1] + nums[2];

        Arrays.sort(nums);

        if(nums.length < 3){
            return 0;
        }
        
        for(int i=0; i<nums.length-2; i++){

            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int left=i+1;
            int right=nums.length-1;

            while(left<right){

                int sum = nums[i] + nums[left] + nums[right];

                if(Math.abs(sum - target) < Math.abs(result - target)){
                    result=sum;
                }

                if(sum < target){
                    left+=1;
                } else if(sum > target){
                    right-=1;
                } else{
                    return target;
                } 
            }
        }

        return result;
    }
}