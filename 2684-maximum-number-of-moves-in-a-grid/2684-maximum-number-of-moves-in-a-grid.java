class Solution {
    int dp[][];
    public int maxMoves(int[][] grid) {
        int ans=0;
        dp=new int[grid.length][grid[0].length];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        for(int i=0;i<grid.length;i++){
           
                ans=Math.max(ans,solve(i,0,grid,-1,-1));
            
        }
        return ans-1;
    }
    int solve(int i,int j,int a[][],int previ,int prevj){
        if(i<0||j<0||i>=a.length||j>=a[0].length||(previ!=-1&&prevj!=-1&&a[i][j]<=a[previ][prevj])){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int aage=solve(i,j+1,a,i,j);
         int aageeche=solve(i+1,j+1,a,i,j);
          int aageup=solve(i-1,j+1,a,i,j);
          return dp[i][j]= Math.max(aage,Math.max(aageeche,aageup))+1;
    }
}