class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        if(nums.length < 4){
            return new ArrayList<>(0);
        }
        
        for(int i=0; i<nums.length-3; i++){
            
            if (i>0 && nums[i]==nums[i-1]){
                    continue;
            }

            for(int j=i+1; j<nums.length-2; j++){

                if (j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }

                int left = j+1;
                int right = nums.length -1;

                while (left < right){
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target){
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while (left < right && nums[left]==nums[left+1]) {
                            left+=1;
                        }
                        while (left < right && nums[right]==nums[right-1]) {
                            right-=1;
                        }
                        left +=1;
                        right -=1;

                    } else if(sum < target){
                        left+=1;
                    } else {
                        right-=1;
                    }
                }
            }
        }

        return result;
    }

}