class Solution {
    public int maximumStrongPairXor(int[] nums) {
        List<List<Integer>> list = strongPairs(nums);

        int maxXOR = 0;

        for(List<Integer> pairs : list){
            int x = pairs.get(0);
            int y = pairs.get(1);

            maxXOR = Math.max(maxXOR, x^y);
        }

        return maxXOR;
    }

    private List<List<Integer>> strongPairs(int[] nums){

        List<List<Integer>> res = new ArrayList();
        
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(Math.abs(nums[i]-nums[j]) <= Math.min(nums[i], nums[j])){
                    res.add(Arrays.asList(nums[i], nums[j]));
                }
            }
        }
        return res;
    }
}