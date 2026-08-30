class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s == null || s.length() == 0) return 0;

        int maxLength = 0;

        for(int i=0; i<s.length(); i++){
            
            Set<Character> sub = new HashSet<>();

            for(int j=i; j<s.length(); j++){

                if(sub.contains(s.charAt(j))){
                    break;
                } else {
                    sub.add(s.charAt(j));
                    maxLength = Math.max(maxLength, j-i+1);
                }
            }
        }

        return maxLength;
    }
}