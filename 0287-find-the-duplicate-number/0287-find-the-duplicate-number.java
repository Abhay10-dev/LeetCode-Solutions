class Solution {
    public int findDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int dup=0;

        for(int num : nums){
            if(!set.add(num)){
                dup = num;
                break;
            }
        }

        return dup;
    }
}