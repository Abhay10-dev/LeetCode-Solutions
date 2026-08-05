class Solution {
    public int strStr(String haystack, String needle) {
        
        char[] s = haystack.toCharArray();
        char[] p = needle.toCharArray();
        int first=0, second=0, start=0;

        if (needle.length()==0){ return 0; }
        if (haystack.length() < needle.length()) { return -1; }

        while(first < haystack.length()){
            if (p[second] == s[first]) {
                first+=1;
                second+=1;
                if (second == needle.length()) {
                    return start;
                }
            } else {
                start+=1;
                first=start;
                second=0;
            }
        }
        return -1;
    }
}