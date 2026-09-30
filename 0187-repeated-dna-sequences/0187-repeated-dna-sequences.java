class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>();
        Set<String> dup = new HashSet<>();

        for(int i=0; i <= s.length()-10; i++){
            String sub = s.substring(i, i+10);

            if(!set.add(sub)){
                dup.add(sub);
            }
        }

        return new ArrayList<>(dup);
    }
}