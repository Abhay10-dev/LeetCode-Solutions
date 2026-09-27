class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length==2) return new int[]{nums[0], nums[1]};

        Set<Integer> set = new HashSet<>();
        Set<Integer> dup = new HashSet<>();
        int[] res = new int[2];
        int n = nums.length;

        for(int num : nums){
            if(!set.add(num)){
                dup.add(num);
            }
        }
        
        int count = 0; 
        
        for (int j = 0; j < n && count < 2; j++) {            
            if (!dup.contains(nums[j])) {
                res[count] = nums[j];
                count++;
            }
        }

        return res;
    }
}