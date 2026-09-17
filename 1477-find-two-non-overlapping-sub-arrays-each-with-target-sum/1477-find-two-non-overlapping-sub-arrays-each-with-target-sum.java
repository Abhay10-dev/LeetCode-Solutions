class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        if(arr.length < 2) return -1;
        int n = arr.length;
        int[] minLeft = new int[n];
        int left = 0;
        int sum = 0;
        int minLengthSoFar = Integer.MAX_VALUE;    
        int res = Integer.MAX_VALUE;    

        for(int right=0; right < n; right++){
            sum = sum + arr[right];

            while(sum > target){
                sum = sum - arr[left];
                left++;
            }

            if(sum == target){
                int currLength = right - left + 1;
                minLengthSoFar = Math.min(minLengthSoFar, currLength);

                if(left > 0 && minLeft[left-1] != Integer.MAX_VALUE){
                    res = Math.min(res, currLength + minLeft[left-1]);
                }
            }
            minLeft[right] = minLengthSoFar;
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}