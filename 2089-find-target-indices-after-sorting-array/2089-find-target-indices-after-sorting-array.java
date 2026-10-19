class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();

        int count = 0;
        int lessThanTarget = 0;

        for(int num : nums){
            if(num < target){
                lessThanTarget++;
            }
            if(num == target){
                count++;
            }
        }

        for(int i=0; i < count; i++){
            res.add(lessThanTarget + i);
        }

        return res;
    }
}