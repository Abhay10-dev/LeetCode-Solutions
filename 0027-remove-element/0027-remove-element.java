class Solution {
    public int removeElement(int[] nums, int val) {

        int[] filtered = Arrays.stream(nums)
                                .filter(i -> i!=val)
                                .toArray();

        for(int i=0; i<filtered.length; i++){
            nums[i] = filtered[i];
        }

        return filtered.length;
    }
}