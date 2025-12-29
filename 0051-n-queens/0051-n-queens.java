class Solution {
    public List<List<String>> solveNQueens(int n) {
     boolean board[][]=new boolean[n][n];
    // nqueens b=new nqueens();
     List<List<String>> him=new ArrayList<>();
    queens(board, 0,him);
        return him;
    }
     void queens(boolean board[][],int row,    List<List<String>> him){
        if(row==board.length){
            display(board,him);
            return;
        }
        for(int col=0;col<board.length;col++){
            if(issafe(board,row,col)){
                board[row][col]=true;
                queens(board, row+1,him);
                board[row][col]=false;
            }
        }
    }
    private boolean issafe(boolean[][] board, int row, int col) {
      for(int i=0;i<row;i++){
        if(board[i][col]){
            return false;
        }
    }
        int maxleft=Math.min(row,col);
        for(int i=1;i<=maxleft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        int maxright=Math.min(row, board.length-col-1);
        for(int i=1;i<=maxright;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
      }
    
    private void display(boolean[][] board, List<List<String>> him) {
        ArrayList<String> him1=new ArrayList<>();
        
        for (boolean[] bs : board) {
            String p="";
            for (boolean b: bs) {
                if(b){
                    p=p+'Q';
                }
                else{
                    p=p+'.';
                }
             
            }
                him1.add(p);
        }
       
        him.add(him1);
    }
}