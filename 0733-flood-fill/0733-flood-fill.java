class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       boolean vis[][]=new boolean[image.length][image[0].length];
        int v=image[sr][sc];
        image[sr][sc]=color;
        if(sr>0&&vis[sr-1][sc]==false&&image[sr-1][sc]==v){
           vis[sr-1][sc]=true;
            image[sr-1][sc]=color;
            dfs(image,vis,sr-1,sc,v,color);
        }
          if(sc>0&&vis[sr][sc-1]==false&&image[sr][sc-1]==v){
           vis[sr][sc-1]=true;
              image[sr][sc-1]=color;
            dfs(image,vis,sr,sc-1,v,color);
        }
        if(sr<vis.length-1&&vis[sr+1][sc]==false&&image[sr+1][sc]==v){
           vis[sr+1][sc]=true;
              image[sr+1][sc]=color;
            dfs(image,vis,sr+1,sc,v,color);
        }
         if(sc<vis[0].length-1&&vis[sr][sc+1]==false&&image[sr][sc+1]==v){
           vis[sr][sc+1]=true;
              image[sr][sc+1]=color;
            dfs(image,vis,sr,sc+1,v,color);
        }
        return image;
    }
    void dfs(int [][]image,boolean vis[][],int sr,int sc,int v,int color){
         if(sr>0&&vis[sr-1][sc]==false&&image[sr-1][sc]==v){
           vis[sr-1][sc]=true;
            image[sr-1][sc]=color;
            dfs(image,vis,sr-1,sc,v,color);
        }
          if(sc>0&&vis[sr][sc-1]==false&&image[sr][sc-1]==v){
           vis[sr][sc-1]=true;
              image[sr][sc-1]=color;
            dfs(image,vis,sr,sc-1,v,color);
        }
        if(sr<vis.length-1&&vis[sr+1][sc]==false&&image[sr+1][sc]==v){
           vis[sr+1][sc]=true;
              image[sr+1][sc]=color;
            dfs(image,vis,sr+1,sc,v,color);
        }
         if(sc<vis[0].length-1&&vis[sr][sc+1]==false&&image[sr][sc+1]==v){
           vis[sr][sc+1]=true;
              image[sr][sc+1]=color;
            dfs(image,vis,sr,sc+1,v,color);
        }
    }
}