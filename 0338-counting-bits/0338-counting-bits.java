class Solution {
    public int[] countBits(int n) {
        if(n==0) return new int[]{0};

       int[] res = new int[n+1]; 
       int element=0;

        for(int i=0; i<=n; i++){
            res[i] = binaryCount(element);
            element++;
        }

        return res;
    }

    private int binaryCount(int n){
        int bitCount=0;
        int i = 0;
        while(n > 0){
            int rem = n % 2;
            if(rem == 1){
                bitCount++;
            }
            n = n / 2;
            i++;
        }

        return bitCount;
    }
}