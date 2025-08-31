class Solution {
    public void solveSudoku(char[][] board) {
        
System.out.println("LeetCode ki Maa Ka...............");
        solve(board);
    }
boolean isvalid(char board[][],int i,int j,int v){
    for(int c=0;c<9;c++){
        if(board[i][c]==(char)(v + '0')){
            return false;
        }
        if(board[c][j]==(char)(v + '0')){
            return false;
        }
    }
    int sr=(i/3)*3;
    int sc=(j/3)*3;
    int er=sr+2;
    int ec=sc+2;
    for(int it=sr;it<=er;it++){
        for(int jt=sc;jt<=ec;jt++){
            if(board[it][jt]==(char)(v + '0')){
                return false;
            }
        }
    }
return true;

}
    boolean solve(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (int v = 1; v <= 9; v++) {
                        if(isvalid(board,i,j,v)){
                            board[i][j]=(char)(v + '0');
                            if(solve(board)){
                              return true;
                            }
                              board[i][j]='.';
                        }
                    }
                    return false;
                }
            }

        }
        return true;
    }
}