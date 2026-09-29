class Solution {
    Stack<Character> him;
    Boolean dp[][][];
    public boolean hasValidPath(char[][] grid) {
        dp=new Boolean[grid.length][grid[0].length][grid.length+grid[0].length];
        him=new Stack<>();
       return solve(0,0,0,grid); 
    }
    boolean isValid(int i,int j,char [][]a){
            return i>=0&&j>=0&&i<a.length&&j<a[0].length;
    }
    boolean solve(int i,int j,int c,char grid[][]){
        if(!isValid(i,j,grid)){
            return false;
        }

         if(grid[i][j]=='('){
            c=c+1;
        }else{
            c=c-1;
        }
        if (c < 0) {
            return false;
        }


       if(dp[i][j][c]!=null){
        return dp[i][j][c];
       }
       
        if (i == grid.length - 1 &&
            j == grid[0].length - 1) {
            return dp[i][j][c] = c == 0;
        }
        boolean right=solve(i,j+1,c,grid);
        boolean down=solve(i+1,j,c,grid);
        return dp[i][j][c]=right||down;
    }
}