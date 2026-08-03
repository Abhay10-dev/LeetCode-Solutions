class Solution {

    public int[] mergeArrays(int[] nums1, int[] nums2) {

        int length1 = nums1.length;
        int length2 = nums2.length;

        int[] nums = new int[length1+length2];

        for (int i=0; i<length1; i++){
            nums[i] = nums1[i];
        }
        for (int j=0; j<length2; j++){
            nums[length1+j] = nums2[j];
        }

        sortedArray(nums, nums.length);
        return nums;
    }

    public void sortedArray(int[] nums, int n) {

        if(n==1){
            return;
        }
        
        for(int i=0; i<n-1; i++){
            if (nums[i] > nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            } 
        }
        sortedArray(nums, n-1);
    }
    

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = mergeArrays(nums1, nums2);

        // Index
        int ind1 = nums.length/2;
        int ind2 = ind1-1; 

        if (nums.length%2 == 0) {
            return ((nums[ind1]+nums[ind2]) /2.0);
        } else {
            return nums[ind1];
        }

    }
}