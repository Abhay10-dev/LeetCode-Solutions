class Solution {
    public String countAndSay(int n) {
        String s = "1";

        if(n == 1) return s;

        for(int i=1; i < n; i++){
            StringBuilder next = new StringBuilder();
            int length = s.length();
            int j = 0;

            while(j < length){
                int k = j;

                while(k < length && s.charAt(j) == s.charAt(k)){
                    k++;
                }

                next.append(k-j);
                next.append(s.charAt(j));

                j = k;
            }

            s = next.toString();
        }

        return s;
    } 
}