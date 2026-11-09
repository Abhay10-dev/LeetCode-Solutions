class Solution {
    public String longestNiceSubstring(String s) {
        if(s == null || s.length() < 2) return "";

        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            set.add(c);
        }

        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);

            char counter = Character.isLowerCase(c) ?
                                    Character.toUpperCase(c) : Character.toLowerCase(c);

            if(!set.contains(counter)){
                String left = longestNiceSubstring(s.substring(0, i));
                String right = longestNiceSubstring(s.substring(i+1));

                return left.length() >= right.length() ? left : right;
            }
        }

        return s;
    }
}