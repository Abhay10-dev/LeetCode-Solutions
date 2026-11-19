class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        for(int rot=0; rot < 4; rot++){
            if(isEqual(mat, target)){
                return true;
            }
            rotate90(mat);
        }

        return false;
    }

    private void rotate90(int[][] mat){
        int n = mat.length;

        for(int i=0; i < n; i++){
            for(int j=i+1; j < n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int i=0; i < n; i++){
            int left = 0; 
            int right = mat[i].length-1;

            while(left < right){
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;

                left++;
                right--;
            }
        }
    }

    private boolean isEqual(int[][] mat, int[][] target){
        int n = mat.length;

        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }

        return true;
    }
}