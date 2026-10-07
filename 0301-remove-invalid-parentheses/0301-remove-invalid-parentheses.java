class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.offer(s);
        visited.add(s);

        boolean found = false;

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0; i < size; i++){
                String current = queue.poll();

                if(isValid(current)){
                    ans.add(current);
                    found = true;
                }

                if(found) continue;

                for(int j=0; j < current.length(); j++){
                    char c = current.charAt(j);

                    if(c != '(' && c != ')') continue;

                    String next = current.substring(0, j) + current.substring(j+1);

                    if(!visited.contains(next)){
                        visited.add(next);
                        queue.offer(next);
                    }
                }
            }
            if(found) break;
        }

        return ans;
    }

    private boolean isValid(String s){
        int count = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                count++;
            } else if(c == ')'){
                count--;

                if(count < 0){
                    return false;
                }
            }
        }

        return count == 0;
    }
}