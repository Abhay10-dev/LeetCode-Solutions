class Solution {
    public boolean isSubsequence(String s, String t) {

        if(s == null || t == null) return true;
        if(s.length() > t.length()) return false;
        if(s.isEmpty()) return true;;
        
        int i=0;
        int j=0;

        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }

        return i == s.length();
    }
}