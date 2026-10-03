class Solution {

    public int titleToNumber(String ct) {
        if(ct == null) return -1;

        int res = 0;

        for(int i=0; i < ct.length(); i++){
            res = res * 26 + numericValue(ct.charAt(i));
        }

        return res;
    }

    private int numericValue(char c){
        return (c-'A')+1;
    }
}