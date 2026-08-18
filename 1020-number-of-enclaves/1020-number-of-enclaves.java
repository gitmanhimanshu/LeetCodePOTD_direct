class Pair{
    int i;
    int j;
    Pair(int i,int j){
        this.i=i;
        this.j=j;
    }
}
class Solution {
    boolean isValid(int i, int j, int[][] a) {
    return i >= 0 && j >= 0 && i < a.length && j < a[0].length && a[i][j] == 1;
}
    public int numEnclaves(int[][] grid) {
        Queue<Pair>him=new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 1) {
                him.add(new Pair(i, 0));
                grid[i][0]=2;               
            }
            if (grid[i][grid[0].length - 1] == 1) {
                him.add(new Pair(i, grid[0].length - 1));
               grid[i][grid[0].length - 1]=2;
            }
        }

        for (int j = 0; j < grid[0].length; j++) {
            if (grid[0][j] == 1) {
                him.add(new Pair(0, j));
                 grid[0][j]=2;               
            }
            if (grid[grid.length - 1][j]==1) {
                him.add(new Pair(grid.length - 1, j));
                 grid[grid.length - 1][j]=2;
               
            }
        }

        int dir[][]=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        while(!him.isEmpty()){
                Pair p=him.poll();
            for(int d[]:dir){
                int next_i=p.i+d[0];
                int next_j=p.j+d[1];
                if(isValid(next_i,next_j,grid)){
                    grid[next_i][next_j]=2;
                    him.add(new Pair(next_i,next_j));
                }
            }
        }
        int ans=0;
        for(int a[]:grid){
            for(int i:a){
                if(i==1){
                    ans++;
                }
            }
        }
        return ans;
    }
}