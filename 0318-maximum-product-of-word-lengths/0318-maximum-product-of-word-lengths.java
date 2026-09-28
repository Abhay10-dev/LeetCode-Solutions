class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        boolean[][] hasChar = new boolean[n][26];
        int maxRes = 0;

        for(int i=0; i < n; i++){
            for(char c : words[i].toCharArray()){
                hasChar[i][c-'a'] = true;
            }
        }

        for(int i=0; i < n; i++){
            for(int j=i+1; j < n; j++){

                if(hasNoCommonChar(hasChar[i], hasChar[j])) {
                    int product = words[i].length() * words[j].length();
                    maxRes = Math.max(maxRes, product);
                }
            }
        }

        return maxRes;
    }

    private boolean hasNoCommonChar(boolean[] c1, boolean[] c2){

        for(int i=0; i < 26; i++){
            if(c1[i] && c2[i]){
                return false;
            }
        }

        return true;
    }
}