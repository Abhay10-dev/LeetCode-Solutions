class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> res = new HashSet<>();
        
        Arrays.sort(nums2);
        
        for(int i=0; i < nums1.length; i++){
            int left = 0;
            int right = nums2.length-1;
            
            while(left <= right){
                int mid = left + (right - left)/2;
                
                if(nums1[i] == nums2[mid]){
                    res.add(nums2[mid]);
                    break;
                } else if(nums2[mid] < nums1[i]){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return res
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();

    }
}