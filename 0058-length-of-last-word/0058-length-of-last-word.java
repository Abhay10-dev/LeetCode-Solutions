class Solution {
    public int lengthOfLastWord(String s) {
        String remS = s.trim();
        int count=0;
        
        for(int i=remS.length()-1; i>=0; i--){
            if(remS.charAt(i)==' '){
                break;
            } else{
                count++;
            }
        }

        return count;
    }
}