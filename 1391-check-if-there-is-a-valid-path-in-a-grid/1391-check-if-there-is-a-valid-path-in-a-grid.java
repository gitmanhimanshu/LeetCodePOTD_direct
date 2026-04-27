class Solution {
    int n, m;
    Map<Integer, int[][]> dir = new HashMap<>();

    public Solution(){
        dir.put(1, new int[][]{{0, -1}, {0, 1}});
        dir.put(2, new int[][]{{-1, 0}, {1, 0}});
        dir.put(3, new int[][]{{0, -1}, {1, 0}});
        dir.put(4, new int[][]{{0, 1}, {1, 0}});
        dir.put(5, new int[][]{{0, -1}, {-1, 0}});
        dir.put(6, new int[][]{{-1, 0}, {0, 1}});
    }

    public boolean hasValidPath(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        int v[][] = new int[n][m];
        return solve(0, 0, n, m, v, grid);

    }

    boolean solve(int i,int j,int n,int m,int v[][],int[][] grid){
        if(i==n-1&&j==m-1){
            return true;
        }
        v[i][j]=1;
        for(int a[]:dir.get(grid[i][j])){
            int new_i=i+a[0];
            int new_j=j+a[1] ;
            if(new_i<0 ||new_j<0 ||new_i>=n||new_j>=m||v[new_i][new_j]==1){
                continue;
            }
            for(int b[]:dir.get(grid[new_i][new_j])){
                if(new_i+b[0]!=i||new_j+b[1]!=j){
                    continue;
                }
                if(solve(new_i,new_j,n,m,v,grid)){
                    return true;
                }
            }
                   
                   }
                   return false;
    }
}