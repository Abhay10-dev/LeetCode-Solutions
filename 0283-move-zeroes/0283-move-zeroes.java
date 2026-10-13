class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        List<Integer> values = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                values.add(nums[i]);
                nums[i] = 0;
            }
        }

        for(int j=0; j < values.size(); j++){
            nums[j] = values.get(j);
        }
    }
}