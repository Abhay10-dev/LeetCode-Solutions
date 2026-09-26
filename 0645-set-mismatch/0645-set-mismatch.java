class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];

        Arrays.sort(nums);

        Set<Integer> set = new HashSet<>();

        int n = nums.length;
        int expectedSum = (n*(n+1))/2;
        int actualSum = 0;

        for(int i : nums){
            set.add(i);
        }

        for(int i=0; i < n-1; i++){
            if(nums[i] == nums[i+1]){
                res[0] = nums[i];
            }
        }

        for(int num : set){
            actualSum += num;
        }

        res[1] = expectedSum-actualSum;

        return res;
    }
}