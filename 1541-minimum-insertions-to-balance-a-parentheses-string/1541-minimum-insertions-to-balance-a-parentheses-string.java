class Solution {
    public int minInsertions(String s) {

        Stack<Character> open = new Stack<>();
        int ans = 0;
        int n = s.length();

        for(int i=0; i < n; i++){
            char c = s.charAt(i);
            
            if(c == '('){
                open.push(c);
            } else { // ')'
                
                if(i+1 < n && s.charAt(i+1) == ')'){
                    i++;
                } else {
                    ans++;
                }

                if(!open.isEmpty()) {
                    open.pop();
                } else {
                    ans++;
                }
            }
        }

        ans = ans + 2*open.size();
        

        return ans;
    }
}