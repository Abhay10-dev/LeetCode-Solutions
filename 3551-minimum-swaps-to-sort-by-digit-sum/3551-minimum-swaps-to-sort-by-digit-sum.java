class Solution {
    public int minSwaps(int[] nums) {
        if(nums == null || nums.length <= 1) return 0;

        int swapCount = 0, n = nums.length;

        int[] digits = digitSum(nums);

        Integer[] indices = new Integer[n];
        for(int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> {
            if(digits[a] != digits[b]) {
                return Integer.compare(digits[a], digits[b]);
            }
            return Integer.compare(nums[a], nums[b]);
        });

        int[] targetIndex = new int[n];
        for(int i = 0; i < n; i++) {
            targetIndex[indices[i]] = i;
        }

        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++) {
           
            if(visited[i] || targetIndex[i] == i) {
                continue;
            }

            int cycleSize = 0;
            int curr = i;
            while(!visited[curr]) {
                visited[curr] = true;
                curr = targetIndex[curr];
                cycleSize++;
            }

            if(cycleSize > 1) {
                swapCount += (cycleSize - 1);
            }
        }

        return swapCount;
    }

    private int[] digitSum(int[] nums){
        int n = nums.length;

        int[] ds = new int[n];

        for(int i=0; i < n; i++){
            
            int sum = 0;
            int val = nums[i];

            while(val > 0){
                int remainder = val % 10;

                sum = sum + remainder;
                val = val / 10;
            }
            ds[i] = sum;
        }

        return ds;
    }
}