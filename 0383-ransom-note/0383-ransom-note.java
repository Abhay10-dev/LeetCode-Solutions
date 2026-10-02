class Solution {
    public boolean canConstruct(String rn, String mg) {
        if(mg == null) return false;
        if(rn.length() > mg.length()) return false;

        int[] charCount = new int[26];

        for(char c : mg.toCharArray()){
            charCount[c - 'a']++;
        }

        for(char c : rn.toCharArray()){

            if(charCount[c-'a'] == 0) return false;

            charCount[c-'a']--;
        }

        return true;
    }
}