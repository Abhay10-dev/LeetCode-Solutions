class Solution {
    public int minAddToMakeValid(String s) {
        if(s == null || s.length() == 0) return 0;

        Stack<Character> stack = new Stack<>();
        int count = 0;

        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '('){
                stack.push(c);
            } else { // ')'
                if(!stack.isEmpty()){
                    stack.pop();
                } else {
                    count++;
                }
            }
        }

        if(!stack.isEmpty()){
            count = count + stack.size();
        }

        return count;
    }
}