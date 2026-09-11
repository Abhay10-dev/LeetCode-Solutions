class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[nums.length];

        for(int i=0; i<n; i++){
            int nextGreater=-1;

            for(int j=1; j<n; j++){
                int currentIndex = (i+j) % n;

                if(nums[i] < nums[currentIndex]){
                    nextGreater = nums[currentIndex];
                    break;
                } 
            }
            res[i] = nextGreater;
        }

        return res;
    }
}