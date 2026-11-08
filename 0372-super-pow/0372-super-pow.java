class Solution {
    private static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        int res = 1;

        for (int i = b.length - 1; i >= 0; i--) {
            res = ((res % MOD) * (pow(a, b[i]) % MOD)) % MOD;
            a = pow(a, 10);
        }
        
        return res;
    }

    private int pow(int base, int exp) {
        int result = 1;

        for (int i = 0; i < exp; i++) {
            result = ((result % MOD) * (base % MOD)) % MOD;
        }
        return result;
    }
}