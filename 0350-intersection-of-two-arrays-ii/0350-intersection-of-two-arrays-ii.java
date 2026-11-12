class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list = new ArrayList<>();
        int leftBound = 0; 

        for (int num : nums1) {
            int index = binarySearchLeftmost(nums2, leftBound, nums2.length-1, num);
            if (index != -1) {
                list.add(num);
                leftBound = index + 1; 
            }
        }

        int[] res = new int[list.size()];
        for(int i=0; i < list.size(); i++){
            res[i] = list.get(i);
        }

        return res;
    }

    private int binarySearchLeftmost(int[] nums, int left, int right, int target) {
        int foundIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                foundIndex = mid;
                right = mid - 1; 
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return foundIndex;
    }
}