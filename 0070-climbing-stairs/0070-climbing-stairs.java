class Solution {
    public int climbStairs(int n) {
        int[] tempMem = new int[46];

        if(n == 1 || n == 2 || n == 3) return n;

        tempMem[0] = 0;
        tempMem[1] = 1;
        tempMem[2] = 2;

        for(int i=3; i <= n; i++){
            tempMem[i] = tempMem[i-1] + tempMem[i-2];
        }

        return tempMem[n];
    }
}