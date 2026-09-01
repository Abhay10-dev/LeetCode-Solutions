class Solution {
    public boolean isValidSudoku(char[][] board) {
        // [row][col]
  
        // For Row Check
        for(int i=0; i<board.length; i++){

            Set<Character> prev = new HashSet<>();

            for(int j=0; j<board[i].length; j++){

                char current = board[i][j];

                if(current != '.'){
                    if(!prev.add(current)) return false;
                } 
            }
        }

        //[col][row]

        // For Column Check
        for(int i=0; i<board.length; i++){

            Set<Character> prev = new HashSet<>();

            for(int j=0; j<board[i].length; j++){

                char current = board[j][i];

                if(current != '.'){
                    if(!prev.add(current)) return false;
                } 
            }
        }

        // For 3x3 Grid Check
        for(int boxRow=0; boxRow < 9;boxRow+=3){

            for(int boxCol=0; boxCol < 9;boxCol+=3){

                Set<Character> prev = new HashSet<>();

                for(int i=0; i<3; i++){

                    for(int j=0; j<3; j++){

                        char current = board[boxRow+i][boxCol+j];

                        if(current != '.'){
                            if(!prev.add(current)) return false;
                        } 
                    }
                }
            }
        }

        return true;
    }
}