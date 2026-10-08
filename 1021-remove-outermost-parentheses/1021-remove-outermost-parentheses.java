class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0, start = 0;

        StringBuilder sb = new StringBuilder();

        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '('){
                count++;
            } else {
                count--;

                if(count == 0){
                    sb.append(s.substring(start+1, i));
                    start = i+1;
                }
            }
        }

        return sb.toString();
    }
}