class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] res = new int[nums1.length];

        for(int i=0; i < nums1.length; i++){
            int nextGreater = -1;
            boolean found=false;

            for(int j=0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    found=true;
                }
                if(found && nums1[i] < nums2[j]){
                    nextGreater = nums2[j];
                    break;
                }
            }
            res[i] = nextGreater;
        }
        return res;
    }
}