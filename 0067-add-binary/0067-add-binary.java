class Solution {
    public String addBinary(String a, String b) {

        if(a==null && b==null) return null;

        if(a==null) return b;
        if(b==null) return a;

        StringBuilder res =  new StringBuilder();

        int i = a.length()-1;
        int j = b.length()-1;
        int carry=0;

        while(i>=0 || j>=0 || carry>0){
            int sum = carry;

            if(i>=0){
                sum = sum + a.charAt(i) - '0';
                i-=1;
            }
            if(j>=0){
                sum = sum + b.charAt(j) - '0';
                j-=1;
            }

            res.append(sum % 2);
            carry = sum/2;
        }

        return res.reverse().toString();
    }
}