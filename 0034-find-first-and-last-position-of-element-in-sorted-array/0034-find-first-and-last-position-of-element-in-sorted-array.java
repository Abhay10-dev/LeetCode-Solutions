class Solution {

    public int[] searchRange(int[] nums, int target){

        if(nums.length <= 0) return new int[]{-1, -1};

        int[] res = new int[]{-1,-1};

        res[0] = findIndex(nums, target, true);

        if(res[0] != -1){
            res[1] = findIndex(nums, target, false);
        }

        return res;
    }

    public int findIndex(int[] nums, int target, boolean isFirst) {
        int left=0;
        int right = nums.length-1;
        int index = -1;

        while(left <= right){
            int mid = left + (right-left)/2;

            if(nums[mid] == target){
                index = mid;

                if(isFirst){
                    right = mid-1;
                } else {
                    left = mid+1;
                }
            } else if(nums[mid] < target){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }

        return index;
    }
}