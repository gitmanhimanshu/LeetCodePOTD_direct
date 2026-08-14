class Pair{
    int i;
    int j;
    public Pair(int i,int j){
        this.i=i;
        this.j=j;
    }
}
class Solution {
    int n;
    public int orangesRotting(int[][] grid) {
        n=grid.length;
        int one=0;
        Queue<Pair> him=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    him.add(new Pair(i,j));
                }else if(grid[i][j]==1){
                    one++;
                }
            }
        }
        if(one==0){
            return 0;
        }

        int ans=0;
        int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
        while(!him.isEmpty()){
            int l=him.size();
            for(int k=1;k<=l;k++){
                Pair p=him.poll();
                int i=p.i;
                int j=p.j;
                for(int d[]:dir){
                    int new_i=i+d[0];
                    int new_j=j+d[1];
                    if(isValid(new_i,new_j,grid)){
                        him.add(new Pair(new_i,new_j));
                        grid[new_i][new_j]=2;
                        one--;
                    }
                }
               
            }
             ans++;
        }
        if(one==0){
            return ans-1;
        }
        return -1;
    }
    boolean isValid(int i,int j,int [][]a){
        if(i>=0&&i<n&&j>=0&&j<a[0].length&&a[i][j]==1){
            return true;
        }
        return false;
    }
}