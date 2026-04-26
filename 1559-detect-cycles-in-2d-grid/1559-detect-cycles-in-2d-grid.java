class Solution {
    int dir[][] = { { 1, 0 }, { -1, 0 }, { 0, -1 }, { 0, 1 } };

    public boolean containsCycle(char[][] grid) {
        int vis[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(vis[i][j]!=1)
{                if(solve(grid,-1,-1,i,j,vis)){
                    return true;
                }}
            }
        }
        return false;
        
    }

    boolean solve(char[][] grid,int prev_r,int prev_c,int r,int c,int v[][] ){
        v[r][c]=1;
        for (int d[]:dir){
            int nr=r+d[0];
            int ny=c+d[1];
            if(nr<0 || ny<0 || nr>=grid.length||ny>=grid[0].length){
                continue;
            }
            if((nr==prev_r&&ny==prev_c)||grid[r][c]!=grid[nr][ny]){
                continue;
            }
            if(v[nr][ny]==1){
                return true;
            }
            if(solve(grid,r,c,nr,ny,v)){
                    return true;
                }
        }
        return false;
    }
}