class Solution {
    boolean b[][];
    public boolean exist(char[][] board, String word) {
        b=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                   if (solve(i,j,word,board,0)){
                    return true;
                   }
                }
            }
        }
        return false;
    }
    boolean solve(int i,int j,String word,char a[][],int ind){
        if(ind>=word.length()){
            return true;
        }
        if (i < 0 || j < 0 || i >= a.length || j >= a[0].length
                || a[i][j] != word.charAt(ind)||b[i][j]) {
            return false;
        }
        b[i][j]=true;
      boolean t=  solve(i+1,j,word,a,ind+1)||solve(i-1,j,word,a,ind+1)||solve(i,j+1,word,a,ind+1)||solve(i,j-1,word,a,ind+1);
        b[i][j]=false;
        return t;


    }
}