class Solution {
    public List<String> removeAnagrams(String[] words) {
        if(words == null || words.length == 0) return new ArrayList<>();

        List<String> res = new ArrayList<>();

        for(String s : words){
            res.add(s);
        }

        for(int i=1; i < res.size(); i++){
            String first = res.get(i);
            String second = res.get(i-1);

            if(isAnagram(first, second)){
                res.remove(i);
                i--;
            }
        }

        return res;
    }

    private boolean isAnagram(String s, String t) {

        if(s==null || t==null || s.length() != t.length()) return false;

        int[] count = new int[26];

        for(int i=0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int i : count){
            if(i != 0) return false;
        }        

        return true;
    }
}