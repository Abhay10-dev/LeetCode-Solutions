class Solution {
    public int maxArea(int[] height) {
        
        int i=0, j=height.length-1;
        int maxArea=0;

        while(i<j){

            int minValue = Math.min(height[i], height[j]);
            int distance = Math.abs(j-i);

            int area = minValue*distance;
            maxArea = Math.max(area, maxArea);

            if (height[i] < height[j]){
                i+=1;
            } else{
                j-=1;
            }
        }
        return maxArea;
    }
}