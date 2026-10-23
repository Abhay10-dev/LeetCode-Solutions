class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if(pattern.length() != words.length) return false;

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordTochar = new HashMap<>();

        for(int i=0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String w = words[i];

            if(charToWord.containsKey(c) && !charToWord.get(c).equals(w)){
                return false;
            }
            if(wordTochar.containsKey(w) && wordTochar.get(w) != c){
                return false;
            }

            charToWord.put(c, w);
            wordTochar.put(w, c);
        }

        return true;
    }
}