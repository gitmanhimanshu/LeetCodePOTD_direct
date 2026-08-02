class Solution {
    int dp[][];
    public boolean stoneGame(int[] piles) {
        int sum=0;
        dp=new int[piles.length+1][piles.length+1];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        for(int i:piles){
            sum+=i;
        }
        int aliceGot=solve(0,piles.length-1,piles);
        int bobGot=sum-aliceGot;
        return aliceGot>bobGot;

        
    }
    int solve(int i,int j,int a[]){
        if(i>j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int take_i=a[i]+Math.min(solve(i+2,j,a),solve(i+1,j-1,a));
        int take_j=a[j]+Math.min(solve(i+1,j-1,a),solve(i,j-2,a));
        return dp[i][j]=Math.max(take_i,take_j);
    }
}