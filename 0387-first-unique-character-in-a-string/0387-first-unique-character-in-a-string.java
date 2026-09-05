class Solution {
    public int firstUniqChar(String s) {

        if(s==null || s.length() == 0) return -1;
        if(s.length() == 1) return 0;


        for(int i=0; i<s.length(); i++){
            boolean isDuplicate = false;
            for(int j=0; j<s.length(); j++){
                if(i != j && s.charAt(j)==s.charAt(i)){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                return i;
            }
        }
        return -1;
    }
}