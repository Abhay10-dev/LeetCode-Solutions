class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        if(n==0) return 0;
        
        int[][] counts = new int[n][11];

        for (int[] p : pick) {
            int player = p[0];
            int color = p[1];
            counts[player][color]++;
        }

        int winningPlayers = 0;

        for (int i = 0; i < n; i++) {
            for (int color = 0; color <= 10; color++) {
                if (counts[i][color] >= i + 1) {
                    winningPlayers++;
                    break;
                }
            }
        }

        return winningPlayers;
    }
}