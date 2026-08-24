class Pair {
    int i;
    int j;

    public Pair(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

class Solution {
    boolean isValid(int i,int j,int [][]grid){
        return i<grid.length&&j<grid[0].length&&i>=0&&j>=0&&grid[i][j]==0;
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int ans = 0;
        if (grid[0][0] == 1 || 
    grid[grid.length - 1][grid[0].length - 1] == 1) {
    return -1;
}
        int d[][] = new int[][] { { 1, 1 }, { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };
        Queue<Pair> him = new LinkedList<>();
        him.add(new Pair(0, 0));
        grid[0][0]=1;
        while (!him.isEmpty()) {
            int l = him.size();
            while (l > 0) {
                
                l--;
                Pair p = him.poll();
                if(p.i==grid.length-1&&p.j==grid[0].length-1){
                    return ans+1;
                }

                for (int a[] : d) {
                    int next_i = p.i + a[0];
                    int next_j = p.j + a[1];
                    if (isValid(next_i, next_j, grid)) {
                        him.add(new Pair(next_i,next_j));
                        grid[next_i][next_j]=1;
                    }
                }
            }
            ans++;
        }
        return -1;
    }
}