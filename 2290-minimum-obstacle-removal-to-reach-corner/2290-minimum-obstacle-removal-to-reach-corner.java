class p implements Comparable<p> {
    int wt;
    int i, j;

    p(int wt, int i, int j) {
        this.wt = wt;
        this.i = i;
        this.j = j;
    }

    public int compareTo(p that) {
        return this.wt - that.wt;
    }
}

class Solution {
    public int minimumObstacles(int[][] grid) {
        int ans[][] = new int[grid.length][grid[0].length];
        for (int a[] : ans) {
            Arrays.fill(a, Integer.MAX_VALUE);
        }
        ans[0][0]=0;
        int dir[][]={{1,0},{-1,0},{0,1},{0,-1}};
        PriorityQueue<p>him=new PriorityQueue<>();
        him.add(new p(0,0,0));
        while(!him.isEmpty()){
         p h=him.poll();
         int wt=h.wt;
         int i=h.i;
         int j=h.j;
         for(int a[]:dir){
            int x=i+a[0];
            int y=j+a[1];
            if(x>=0&&y>=0&&x<grid.length&&y<grid[0].length){
                if(wt+grid[x][y]<ans[x][y]){
                    ans[x][y]=wt+grid[x][y];
                    him.add(new p(wt+grid[x][y],x,y));
                }
            }
         }
        }
        return ans[grid.length-1][grid[0].length-1];
    }
}

// 6 testcases passed
// class Solution {
// int v[][];

// public int minimumObstacles(int[][] grid) {
// v = new int[grid.length][grid[0].length];
// return solve(0, 0, grid);
// }

// int solve(int i, int j, int grid[][]) {
// if (i == grid.length - 1 && j == grid[0].length - 1) {
// return 0;
// }
// if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
// return Integer.MAX_VALUE / 2;
// }
// if (v[i][j] == 1) {
// return Integer.MAX_VALUE / 2;
// }
// v[i][j] = 1;
// int l = Integer.MAX_VALUE / 2;
// int r = Integer.MAX_VALUE / 2, u = Integer.MAX_VALUE / 2, d =
// Integer.MAX_VALUE / 2;
// r = (grid[i][j] == 0) ? solve(i, j + 1, grid) : 1 + solve(i, j + 1, grid);
// l = (grid[i][j] == 0) ? solve(i, j - 1, grid) : 1 + solve(i, j - 1, grid);
// u = (grid[i][j] == 0) ? solve(i - 1, j, grid) : 1 + solve(i - 1, j, grid);
// d = (grid[i][j] == 0) ? solve(i + 1, j, grid) : 1 + solve(i + 1, j, grid);
// v[i][j] = 0;
// return Math.min(l, Math.min(r, Math.min(u, d)));
// }
// }