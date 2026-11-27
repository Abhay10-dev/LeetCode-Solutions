class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n == 2 || n == 3) return n;

        int firstStep = 1;
        int secondStep = 2;
        int numberOfSteps = 3;

        for(int i=3; i <= n; i++){
            numberOfSteps = firstStep + secondStep;

            int temp = secondStep;
            secondStep = numberOfSteps;
            firstStep = temp;
        }

        return numberOfSteps;
    }
}