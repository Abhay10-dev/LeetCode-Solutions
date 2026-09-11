class Solution {
    public int totalNumbers(int[] digits) {
        int n = digits.length;
        boolean isValid = isPresent(digits);
        if(!isValid) return 0;

        Set<Integer> uniqueNum = new HashSet<>();

        for(int i=0; i<n; i++){
            if(digits[i] == 0) continue;

            for(int j = 0; j<n; j++){
                if(i==j) continue;

                for(int k=0; k<n; k++){
                    if(i==k || j==k) continue;

                    if(digits[k]%2 != 0) continue;

                    int num = 100*digits[i] + 10*digits[j] + digits[k];
                    uniqueNum.add(num);
                }
            }
        }

        return uniqueNum.size();
    }

    private boolean isPresent(int[] d){
        int i=0;
        while(i<d.length){
            if(d[i]%2 == 0){
                return true;
            }
            i++;
        }
        return false;
    }
}