class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;

        int n = s.length();
        Set<Character> sub = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for(int right=0; right<n; right++){
            
            while(sub.contains(s.charAt(right))){
                sub.remove(s.charAt(left));
                left++;
            }
            sub.add(s.charAt(right));
            maxLength = Math.max(maxLength, right-left+1);
        }

        return maxLength;
    }
}