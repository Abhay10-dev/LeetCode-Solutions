class Solution {
    public void nextPermutation(int[] nums) {
        
        int length = nums.length;
        int index = breakPoint(nums);

        if(index==-1) {

            reverse(nums, 0, length-1);

        } else {

            for(int i=length-1; i>=index; i--){
                if(nums[i] > nums[index]){
                    swap(nums, i, index);
                    break;
                }
            }
            reverse(nums, index+1, length-1);
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private int breakPoint(int[] nums){
        int index=-1;
        int length = nums.length;

        for(int i=length-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        return index;
    } 
}