class Solution {
    int dp[][];
    public int longestIncreasingPath(int[][] matrix) {
        int ans=0;
        dp=new int[matrix.length][matrix[0].length];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ans=Math.max(ans,solve(i,j,-1,-1,matrix));
            }
    }
    return ans;
    }
    int solve(int i,int j,int previ,int prevj,int a[][]){
        if(i<0||j<0||i>=a.length||j>=a[0].length||(previ!=-1&&prevj!=-1&&a[i][j]<=a[previ][prevj])){
            return 0;
        }
        if(dp[i][j]!=-1)
            {return dp[i][j];}
        
        int up=1+solve(i-1,j,i,j,a);
        int d=1+solve(i+1,j,i,j,a);
        int l=1+solve(i,j-1,i,j,a);
        int r=1+solve(i,j+1,i,j,a);
        return dp[i][j]=Math.max(up,Math.max(d,Math.max(l,r)));
    }
}