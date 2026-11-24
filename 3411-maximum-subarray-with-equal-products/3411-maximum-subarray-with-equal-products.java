class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxVal = 0;
        long overallLcm = 1;

        for (int x : nums) {
            maxVal = Math.max(maxVal, x);
            overallLcm = lcm(overallLcm, x);
        }

        long maxProdBound = overallLcm * maxVal;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            long prod = 1;
            long g = 0;
            long l = 1;

            for (int j = i; j < n; j++) {
                long val = nums[j];
                prod *= val;
                g = gcd(g, val);
                l = lcm(l, val);

                if (prod == l * g) {
                    ans = Math.max(ans, j - i + 1);
                }

                if (prod > maxProdBound) {
                    break;
                }
            }
        }

        return ans;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private long lcm(long a, long b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return (a / gcd(a, b)) * b;
    }
}