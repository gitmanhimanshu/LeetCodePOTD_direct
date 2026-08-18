class Pair {
    int i;
    int j;

    Pair(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

class Solution {
    boolean isValid(int i, int j, int mat[][]) {
        return i >= 0 && j >= 0 && i < mat.length && j < mat[0].length && mat[i][j] == 1;
    }

    public int[][] updateMatrix(int[][] mat) {
        int vis[][] = new int[mat.length][mat[0].length];
        Queue<Pair> him = new LinkedList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    him.add(new Pair(i, j));
                     vis[i][j] = 1;
                }
               
            }
        }
        int c = 1;
        int dir[][] = new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

        while (!him.isEmpty()) {

                Pair p = him.poll();

                for (int d[] : dir) {
                    int next_i = p.i + d[0];
                    int next_j = p.j + d[1];
                    if (isValid(next_i, next_j, mat) && vis[next_i][next_j] == 0) {
                        mat[next_i][next_j] = mat[p.i][p.j] + 1;
                        him.add(new Pair(next_i, next_j));
                         vis[next_i][next_j] = 1;
                    }
                }
            
        }
        return mat;
    }
}