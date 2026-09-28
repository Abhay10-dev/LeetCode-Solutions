class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int maxRes = 0;

        for(int i=0; i < n; i++){
            for(int j=i+1; j < n; j++){

                boolean isUnique = isUniqueString(words[i], words[j]);

                if(!isUnique) continue;

                int product = words[i].length() * words[j].length();

                maxRes = Math.max(maxRes, product);
            }
        }

        return maxRes;
    }

    private boolean isUniqueString(String s1, String s2){

        boolean[] seen = new boolean[256];

        for (char c : s1.toCharArray()) {
            seen[c] = true;
        }
        for (char c : s2.toCharArray()) {
            if (seen[c]) return false;
        }
        return true;
    }
}