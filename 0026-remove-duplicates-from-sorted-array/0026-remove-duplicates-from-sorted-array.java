class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length ==0) {
            return 0;
        }

        int k=0;
        int i=0;

       while (i<nums.length){
            nums[k] = nums[i];
            k++;

            int j=i+1;
            while(j<nums.length && nums[i] == nums[j]){
                j++;
            } 
            i=j;
       } 

        return k;
    }
}