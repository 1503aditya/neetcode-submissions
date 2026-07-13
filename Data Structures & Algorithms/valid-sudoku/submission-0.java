class Solution {
    public boolean isValidSudoku(char[][] board) {
        //System.out.println(boxCheck(board,0,0) + " " + boxCheck(board,0,3) + " "+boxCheck(board,0,6));
        return horizontalCheck(board) && verticalCheck(board) 
        && boxCheck(board,0,0)
        && boxCheck(board,0,3)
        && boxCheck(board,0,6)
        && boxCheck(board,3,0)
        && boxCheck(board,3,3)
        && boxCheck(board,3,6)
        && boxCheck(board,6,0)
        && boxCheck(board,6,3)
        && boxCheck(board,6,6);
    }
    public boolean horizontalCheck(char[][] board){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')
                continue;
                if(map.containsKey(board[i][j]))
                return false;
                map.put(board[i][j],0);
            }
            map.clear();
        }
        return true;
    }
    public boolean verticalCheck(char[][] board){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[j][i]=='.')
                continue;
                if(map.containsKey(board[j][i]))
                return false;
                map.put(board[j][i],0);
            }
            map.clear();
        }
        return true;
    }
    public boolean boxCheck(char[][] board, int first, int last){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=first;i<first+3;i++){
            for(int j=last;j<last+3;j++){
                if(board[i][j]=='.')
                continue;
                if(map.containsKey(board[i][j]))
                return false;
                map.put(board[i][j],0);
            }
        }
        return true;
    }
}
