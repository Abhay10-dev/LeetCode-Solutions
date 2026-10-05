class Solution {
    public int scoreOfParentheses(String s) {
        if(s == null | s.length() == 0) return 0;

        Stack<Integer> stack = new Stack<>();
        int score = 0;

        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '('){
                stack.push(score);
                score = 0;
            } else { // ')'
                if(s.charAt(i-1) == '('){
                    score = stack.peek() + 1;
                } else {
                    score = stack.peek() + 2*score;
                }
                stack.pop();
            }
        }

        return score;
    }
}