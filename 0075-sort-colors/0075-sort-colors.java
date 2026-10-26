class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        quickSort(nums, 0, n-1);
    }

    private void quickSort(int[] nums, int left, int right){

        if(left < right){
            int pivot = partition(nums, left, right);

            quickSort(nums, left, pivot-1);
            quickSort(nums, pivot+1, right);
        }
    }

    private int partition(int[] nums, int left, int right){
        int pivot = nums[right];
        int i = left - 1;

        for(int j=left; j <= right-1; j++){

            if(nums[j] < pivot){
                i++;
                swap(nums, i, j);
            }
        }

        swap(nums, i+1, right);

        return i+1;
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}