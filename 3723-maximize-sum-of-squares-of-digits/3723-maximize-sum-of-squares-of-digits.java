class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num) {
            return "";
        }

        StringBuilder ans = new StringBuilder();
        
        int nines = sum / 9;
        int remainder = sum % 9;

        for (int i = 0; i < nines; i++) {
            ans.append('9');
        }

        if (remainder > 0) {
            ans.append((char) ('0' + remainder));
        }

        while (ans.length() < num) {
            ans.append('0');
        }

        return ans.toString();
    }
}