class Solution {
    boolean isValid(int [][]a,int x,int y){
        if(x>=0&&y>=0&&x<a.length&&y<a[0].length&&a[x][y]==1){
            return true;
        }
        return false;
    }
    public int orangesRotting(int[][] grid) {
      int ans=0;
        int c=0;
        Queue<Pair<Integer,Integer>> him=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                   
                    him.add(new Pair<>(i,j));
                }
                if(grid[i][j]==1){
                    c++;
                }
            }
        }
        if(c==0){
            return 0;
        }
        while(!him.isEmpty()){
             int temp=0;
            int size=him.size();
            for(int i=1;i<=size;i++){
                Pair<Integer,Integer> h=him.poll();
                int x=h.getKey();
               
                int y=h.getValue();
                int ax[]={1,-1,0,0};
                int ay[]={0,0,1,-1};
                for(int j=0;j<4;j++){
                   int x1=x+ax[j];
                    int y1=y+ay[j];
                    if(isValid(grid,x1,y1)){
                        temp++;
                        grid[x1][y1]=2;
                        him.add(new Pair<>(x1,y1));
                    }
                }
            }
             if(temp!=0){
                ans++;
            }
           
        }
         for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                 ans=0;
                }
            }
        }
        if(ans==0){
            return -1;
        }
        return ans;
        
    }
}