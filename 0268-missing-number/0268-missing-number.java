class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int num=0;

        for(int i=0; i<=n; i++){
            boolean isPresent = false;
            for(int j=0; j<n; j++){
                if(nums[j] == num){
                   isPresent = true;
                   break;
                }
            }
            if(isPresent==false) return num;
            num++;
        }

        return -1;
    }
}