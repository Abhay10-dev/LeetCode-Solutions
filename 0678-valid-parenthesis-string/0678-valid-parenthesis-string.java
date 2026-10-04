class Solution {
    public boolean checkValidString(String s) {
        if(s == null || s.length() == 0) return false;

        int min=0 , max=0;

        for(int i=0; i < s.length(); i++){
            int c = s.charAt(i);

            if(c == '('){
                min++;
                max++;
            } else if(c == ')'){
                min--;
                max--;
            } else {
                min--;
                max++;
            }

            if(min < 0){
                min = 0;
            }

            if(max < 0) return false;
        }

        return (min==0);       
    }
}