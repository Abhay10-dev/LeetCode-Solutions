class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums1) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            int count = counts.getOrDefault(num, 0);
            if (count > 0) {
                list.add(num);
                counts.put(num, count - 1);
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