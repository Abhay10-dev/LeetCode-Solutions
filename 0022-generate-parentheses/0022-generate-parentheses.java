class Solution {

    private void backTrack(List<String> result, StringBuilder current, int openCount, int closeCount, int max){

        if(current.length() == max*2){
            result.add(current.toString());
            return;
        }

        if(openCount < max){
            current.append('(');
            backTrack(result, current, openCount+1, closeCount, max);
            current.deleteCharAt(current.length()-1);
        }
        if(openCount > closeCount){
            current.append(')');
            backTrack(result, current, openCount, closeCount+1, max);
            current.deleteCharAt(current.length()-1);
        }

    }


    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        if (n <= 0){
            return result;
        }

        backTrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }
}