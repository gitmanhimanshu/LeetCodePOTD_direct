class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> him = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (him.contains(board[i][j])) {
                    return false;
                }
                him.add(board[i][j]);
            }
        }

        for (int j = 0; j < 9; j++) {
            Set<Character> him = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (him.contains(board[i][j])) {
                    return false;
                }
                him.add(board[i][j]);
            }

        }

        for (int i = 0; i < 9; i += 3) {
          int  er = i + 2;
            for (int j = 0; j < 9; j += 3) {
           int     ec = j + 2;
                if (!valid(board, i, j, er, ec)) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean valid(char board[][], int r, int c, int er, int ec) {
         Set<Character> him = new HashSet<>();
        for (int i = r; i <= er; i++) {
           
            for (int j = c; j <= ec; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (him.contains(board[i][j])) {
                    return false;
                }
                him.add(board[i][j]);
            }
        }
        return true;
    }
    
}