class Solution {

    boolean isValid(int [][]a, int x, int y){
        return x>=0 && y>=0 && x<a.length && y<a[0].length && a[x][y]==1;
    }

    class Pair{
        int i, j;
        Pair(int i, int j){
            this.i = i;
            this.j = j;
        }
    }

    public int orangesRotting(int[][] grid) {

        Queue<Pair> q = new LinkedList<>();

        // add all rotten oranges
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j));
                }
            }
        }

        int time = 0;
        int[] x = {1,-1,0,0};
        int[] y = {0,0,1,-1};

        while(!q.isEmpty()){
            int size = q.size();
            boolean rotted = false;

            for(int i=0;i<size;i++){
                Pair p = q.poll();

                for(int d=0; d<4; d++){
                    int nx = p.i + x[d];
                    int ny = p.j + y[d];

                    if(isValid(grid, nx, ny)){
                        grid[nx][ny] = 2;
                        q.add(new Pair(nx, ny));
                        rotted = true;
                    }
                }
            }

            if(rotted) time++;
        }

        // check if any fresh orange left
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) return -1;
            }
        }

        return time;
    }
}
