class Solution {
    int x[];
    int y[];
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        x=new int[]{1,-1,0,0};
        y=new int[]{0,0,1,-1};
        int st=image[sr][sc];
         for(int i=0;i<4;i++){
            solve(image,sr+x[i],sc+y[i],color,st);
         }
         return image;
    }
    boolean isValid(int [][]a, int x, int y,int color,int st){
        return x>=0 && y>=0 && x<a.length && y<a[0].length && a[x][y]!=color && a[x][y]==st;
    }
   void solve(int image[][],int sr,int sc,int color,int st){
        if(!isValid(image,sr,sc,color,st)){
            return;
        }
        image[sr][sc]=color;
        for(int i=0;i<4;i++){
            solve(image,sr+x[i],sc+y[i],color,st);
         }
    }
}