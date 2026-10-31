class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int minimum = Math.round(n/3); 

        for(Integer num : map.keySet()){
            if(map.get(num) > minimum){
                res.add(num);
            }
        }

        return res;
    }
}