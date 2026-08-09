class Solution {
    int n;
    Integer dp[][][];
    public int stoneGameII(int[] piles) {
      n=piles.length;
      dp=new Integer[2][n+1][n+1];
     return solve(1,piles,0,1);   
    }
    int solve(int alice,int piles[],int i,int m){
        if(i>=n){
            return 0;
        }
        if(dp[alice][i][m]!=null){
            return dp[alice][i][m];
        }
        int r=alice==1? -1:Integer.MAX_VALUE;
        int s=0;
        for(int x=1;x<=Math.min(2*m,n-i);x++){
            s+=piles[i+x-1];
            if(alice==1){
                r=Math.max(r,s+solve(0,piles,i+x,Math.max(x,m)));
            }else{
                r=Math.min(r,solve(1,piles,i+x,Math.max(x,m)));
            }
        }
        return dp[alice][i][m]=r;
    }
};