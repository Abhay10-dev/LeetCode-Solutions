class Solution {
    public boolean checkValidString(String s) {
        if(s == null || s.length() == 0) return false;

        Deque<Integer> openStack = new ArrayDeque<>();
        Deque<Integer> starStack = new ArrayDeque<>();

        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '('){
                openStack.push(i);
            } else if(c == '*'){
                starStack.push(i);
            } else {
                if(!openStack.isEmpty()){
                    openStack.pop();
                } else if(!starStack.isEmpty()){
                    starStack.pop();
                } else {
                    return false;
                }
            }
        }

        while(!openStack.isEmpty() && !starStack.isEmpty()){
            if(openStack.pop() > starStack.pop()){
                return false;
            }
        }

        return openStack.isEmpty();       
    }
}