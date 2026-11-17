class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;

        Arrays.sort(citations);

        for(int i=0; i < n; i++){
            int papersWithAtLeastThisMany = n - i;

            if(citations[i] >= papersWithAtLeastThisMany){
                return papersWithAtLeastThisMany;
            }
        }

        return 0; 
    }
}