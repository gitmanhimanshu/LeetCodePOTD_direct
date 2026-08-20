class Solution {
    int dir[][];

    public int numIslands(char[][] grid) {
        int ans = 0;
        dir = new int[][] { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    ans++;
                    solve(grid, i, j);
                }
            }
          
        }
  return ans;
    }

    void solve(char grid[][], int i, int j) {
        if (i >= grid.length || j >= grid[0].length || i < 0 || j < 0 || grid[i][j] == '0') {
            return;
        }
        grid[i][j]='0';
        for(int a[]:dir){
            solve(grid,i+a[0],j+a[1]);
        }

    }
}