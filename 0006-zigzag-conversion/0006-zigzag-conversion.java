class Solution {
    public String convert(String s, int numRows) {
        if(s == null || s.isEmpty() || numRows <= 0) return "";
        if(s.length() == 1 || numRows == 1) return s;

        StringBuilder res = new StringBuilder();
        int n = s.length();
        int step = 2*numRows-2;

        for(int i=0; i<numRows; i++){
            
            for(int j=i; j<n; j+=step){
                res.append(s.charAt(j));

                if(i != 0 && i != numRows-1 && (j+step-2*i) < n){
                    res.append(s.charAt(j+step-2*i));
                }
            }
        }

        return res.toString();
    }
}