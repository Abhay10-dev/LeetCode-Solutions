class Solution {
    public boolean checkString(String s) {
        boolean isValid = true;

        for(int i=1; i < s.length(); i++){
            char c1 = s.charAt(i-1);
            char c2 = s.charAt(i);

            if(c1 > c2) {
                return false;
            }

        }

        return isValid;
    }
}