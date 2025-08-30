class Solution {
   public boolean isValidSudoku(char[][] board) {
        int[] row = new int[9];
        int[] col = new int[9];
        int[][] rec = new int[3][3];
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] == '.') continue;
                int recI = i / 3;
                int recJ = j / 3;
                int c = 1 << (board[i][j] - '0');
                if((row[i] & c) > 0) return false;
                if((col[j] & c) > 0) return false;
                if((rec[recI][recJ] & c) > 0) return false;
                row[i] |= c;
                col[j] |= c;
                rec[recI][recJ] |= c;
            }
        }
        return true;
}
}