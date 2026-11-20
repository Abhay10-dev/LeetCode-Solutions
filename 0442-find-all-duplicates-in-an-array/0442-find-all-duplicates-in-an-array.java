class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;

        for(int i=0; i < n; i++){
            int val = Math.abs(nums[i]);
            int targetInx = val - 1;

            if(nums[targetInx] < 0){
                res.add(val);
            } else {
                nums[targetInx] = -nums[targetInx];
            }
        }

        return res;
    }
}