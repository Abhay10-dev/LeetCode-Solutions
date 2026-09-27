class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length==2) return new int[]{nums[0], nums[1]};

        Set<Integer> set = new HashSet<>();
        Set<Integer> dup = new HashSet<>();
        int[] res = new int[2];
        int n = nums.length;
        int i=0;

        for(int num : nums){
            if(!set.add(num)){
                dup.add(num);
                i++;
            }
        }
        
        int count = 0; 
        
        for (int j = 0; j < n; j++) {
            boolean exists = false;
            for (int k = 0; k < dup.size(); k++) {
                if (dup.contains(nums[j])) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                res[count] = nums[j];
                count++;
            }
        }

        return res;
    }
}