class Solution {
    public int longestValidParentheses(String s) {
        if(s == null || s.length() == 0) return 0;

        int open=0, close=0;
        int maxLength=0;

        for(int i=0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                open++;
            } else {
                close++;
            }

            if(open == close){
                maxLength = Math.max(maxLength, 2*open);
            } else if(open < close) {
                open = 0;
                close = 0;
            }
        }

        open = 0;
        close = 0;

        for(int i=s.length()-1; i >= 0; i--){
            if(s.charAt(i) == '('){
                open++;
            } else {
                close++;
            }

            if(open == close){
                maxLength = Math.max(maxLength, 2*open);
            } else if(open > close) {
                open = 0;
                close = 0;
            }
        }

        return maxLength;
    }
}