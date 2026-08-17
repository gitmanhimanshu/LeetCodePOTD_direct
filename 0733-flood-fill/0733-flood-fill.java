class Solution {
    int dir[][];
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dir = new int[][]{
    {1, 0},
    {-1, 0},
    {0, 1},
    {0, -1}
};
        int prev=image[sr][sc];
        if(prev == color){
        return image;
    }
        solve(sr,sc,image,prev,color);
        return image;
    }
    boolean isValid(int i,int j,int prev,int a[][]){
        return i>=0&&j>=0&&i<a.length&&j<a[0].length&&a[i][j]==prev;
    }
    void solve(int sr,int sc,int image[][],int prev,int color){
        if(!isValid(sr,sc,prev,image)){
            return ;
        }
        int curr=image[sr][sc];
        image[sr][sc]=color;
        for(int d[]:dir){
            int next_i=sr+d[0];
            int next_j=sc+d[1];
            solve(next_i,next_j,image,curr,color);
        }
    }
}