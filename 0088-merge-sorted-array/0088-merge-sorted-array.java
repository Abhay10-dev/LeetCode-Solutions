class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=m+n-1;
        int j=0;
        while(i >= m){
            nums1[i] = nums2[j];
            j++;
            i--;
        }
        Arrays.sort(nums1);
    }
}