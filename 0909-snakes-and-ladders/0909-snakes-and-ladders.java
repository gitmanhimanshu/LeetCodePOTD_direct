class Solution {
    int[] getCo(int val, int n) {

        int row = n - 1 - (val - 1) / n;
        int col = (val - 1) % n;
        if ((n % 2 == 1 && row % 2 == 1) || (n % 2 == 0 && row % 2 == 0)) {
            col = n - 1 - col;
        }
        return new int[]{row,col};
    }

    public int snakesAndLadders(int[][] board) {
        Queue<Integer> him = new LinkedList<>();
        int n = board.length;
        int steps = 0;
        boolean vis[][] = new boolean[n][n];
        him.add(1);
        vis[n - 1][0] = true;
        while (!him.isEmpty()) {
            int l = him.size();
            while (l>0) {
                l--;
                int x = him.peek();
                him.poll();
                if (x == n * n) {
                    return steps;
                }
                for (int k = 1; k <= 6; k++) {
                    int val = x + k;
                    if (val > n * n) {
                        break;
                    }
                    int[] coord = getCo(val, n);
                    int r = coord[0];
                    int c = coord[1];
                    if (vis[r][c] == true) {
                        continue;
                    }
                    vis[r][c] = true;
                    if (board[r][c] == -1) {
                        him.add(val);
                    } else {
                        him.add(board[r][c]);
                    }

                }

            }
            steps++;
        }
        return -1;
    }
}