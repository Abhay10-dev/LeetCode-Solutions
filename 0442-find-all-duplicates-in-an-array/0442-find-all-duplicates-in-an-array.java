class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        List<Integer> res = new ArrayList<>();

        for(int num : nums){
            if(!unique.add(num)){
                res.add(num);
            }
        }

        return res;
    }
}