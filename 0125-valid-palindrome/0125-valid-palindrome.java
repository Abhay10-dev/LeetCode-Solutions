class Solution {
    public boolean isPalindrome(String s) {
        
        if(s==null) return false;

        String c = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        int left = 0;
        int right = c.length()-1;

        while(left < right){
            if(c.charAt(left) != c.charAt(right)){
                return false;
            }
            left+=1;
            right-=1;
        }
        return true;
    }
}