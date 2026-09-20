class Solution {
    public int reverseBits(int n) {
        if(n > Integer.MAX_VALUE) return -1;

        int res = 0;

        for(int i=0; i<32; i++){
            res = (res << 1) | (n & 1);
            n = n >> 1;
        }

        return res;
    }
}