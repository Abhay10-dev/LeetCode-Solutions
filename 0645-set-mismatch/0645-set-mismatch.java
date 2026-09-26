class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);

        Set<Integer> set = new HashSet<>();

        int n = nums.length;
        int expectedSum = (n*(n+1))/2;
        int actualSum = 0;
        int dup=-1;

        for(int i : nums){
            if(set.add(i)){
                actualSum += i;
            }
        }

        for(int i=0; i < n-1; i++){
            if(nums[i] == nums[i+1]){
                dup = nums[i];
            }
        }

        return new int[]{dup, expectedSum-actualSum};
    }
}