class Solution {
    public boolean isAnagram(String s, String t) {

        if(s==null || t==null || s.length() != t.length()) return false;

        List<Integer> l1 = s.chars()
                            .sorted()
                            .boxed()
                            .collect(Collectors.toList());

        List<Integer> l2 = t.chars()
                            .sorted()
                            .boxed()
                            .collect(Collectors.toList());
        

        return l1.equals(l2) ? true : false;
    }
}