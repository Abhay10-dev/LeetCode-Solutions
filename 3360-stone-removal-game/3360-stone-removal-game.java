class Solution {
    public boolean canAliceWin(int n) {
        if(n < 10) return false;

        int stonesToRemove = 10;
        boolean aliceTurn = true;

        while(n >= stonesToRemove){
            n = n - stonesToRemove;
            stonesToRemove--;

            aliceTurn = !aliceTurn;
        }

        return !aliceTurn;
    }
}