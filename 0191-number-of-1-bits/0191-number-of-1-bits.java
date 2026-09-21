class Solution {

    private int[] convertToBinary(int n){
        int[] bin = new int[35];
        int i=0;

        while(n > 0){
           int rem = n%2;
           bin[i] = rem;
           n = n/2;
           i++; 
        }
        return bin;
    }

    public int hammingWeight(int n) {
        int[] bin = convertToBinary(n);
        int bitCount=0;

        for(int i=0; i<bin.length; i++){
            if(bin[i] == 1){
                bitCount++;
            }
        }

        return bitCount;
    }
}