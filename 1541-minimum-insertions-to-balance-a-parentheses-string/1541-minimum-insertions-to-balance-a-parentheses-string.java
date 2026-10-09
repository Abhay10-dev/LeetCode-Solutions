class Solution {
    public int minInsertions(String s) {

        int openCount = 0;
        int ans = 0;
        int n = s.length();

        for(int i=0; i < n; i++){
            char c = s.charAt(i);
            
            if(c == '('){
                openCount++;
            } else { // ')'
                
                if(i+1 < n && s.charAt(i+1) == ')'){
                    i++;
                } else {
                    ans++;
                }

                if(openCount > 0) {
                    openCount--;
                } else {
                    ans++;
                }
            }
        }

        ans = ans + (2 * openCount);
        

        return ans;
    }
}