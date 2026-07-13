class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            for(int j=0;j<9;j++){
                if (board[i][j] != '.' && !row.add(board[i][j]))
                return false;
                if(board[j][i] != '.' && !col.add(board[j][i]))
                return false;
            }
        }
        for(int boxRow=0;boxRow<9;boxRow+=3){
            for(int boxCol=0;boxCol<9;boxCol+=3){
                HashSet<Character> square = new HashSet<>();
                for(int i=boxRow;i<boxRow+3;i++){
                    for(int j=boxCol;j<boxCol+3;j++){
                        if (board[i][j] == '.')
                            continue;
                        if(!square.add(board[i][j]))
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
