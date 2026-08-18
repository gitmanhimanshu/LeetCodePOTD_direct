class Pair {
    int i;
    int j;

    Pair(int i, int j) {
        this.i = i;
        this.j = j;
    }
}



class Solution {
    boolean isValid(int i, int j, char[][] board) {
    return i >= 0 && j >= 0 && i < board.length && j < board[0].length && board[i][j] == 'O';
}
    public void solve(char[][] board) {
        Queue<Pair> him = new LinkedList<>();
        
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 'O') {
                him.add(new Pair(i, 0));
                board[i][0]='#';
               
            }
            if (board[i][board[0].length - 1] == 'O') {
                him.add(new Pair(i, board[0].length - 1));
               board[i][board[0].length - 1]='#';
            }
        }

        for (int j = 0; j < board[0].length; j++) {
            if (board[0][j] == 'O') {
                him.add(new Pair(0, j));
                 board[0][j]='#';
               
            }
            // if(j==1){
            //     System.out.println(board[board.length - 1][j]);
            //     System.out.println(board[board.length - 1][j]=='O');
            // }
            if (board[board.length - 1][j]=='O') {
                // System.out.println(board[board.length - 1][j]);
                him.add(new Pair(board.length - 1, j));
                 board[board.length - 1][j]='#';
               
            }
        }
            int dir[][]=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
          
        while(!him.isEmpty()){
            Pair p=him.poll();
            for(int d[]:dir){
                int next_i=p.i+d[0];
                int next_j=p.j+d[1];
                if(isValid(next_i,next_j,board)){
                    board[next_i][next_j]='#';
                    him.add(new Pair(next_i,next_j));
                }
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'){
                    
                        board[i][j]='X';
                    
                }else  if(board[i][j]=='#'){
                    
                        board[i][j]='O';
                    
                }
            }
        }

    }
}