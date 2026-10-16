class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();

        List<List<String>> ans = new ArrayList<>();
        List<String> sl = new ArrayList<>();

        for(String s : strs){
            sl.add(s);
        }

        int i = 0;
        while(i < sl.size()){

            List<String> group = new ArrayList<>();

            String first = sl.get(i);

            group.add(first);
            sl.remove(i);

            int j = i;
            while(j < sl.size()){
                String second = sl.get(j);

                if(isAnagram(first, second)){
                    group.add(second);
                    sl.remove(j);
                } else {
                    j++;
                }
            }
            
            ans.add(group);
        }

        return ans;
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
