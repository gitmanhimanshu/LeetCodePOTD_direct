class Solution {
    int dp[][];
    public int coinChange(int[] coins, int amount) {
        dp=new int[coins.length][amount+1];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
    int a=solve(coins,amount,coins.length-1);
    if(a==Integer.MAX_VALUE/2){
        return -1;
    }
    return a;
    }
    int solve(int a[],int m,int i){
        if(i==0){
            if(m%a[i]==0){
                return m/a[i];
            }else{
                return Integer.MAX_VALUE/2;
            }}
            if(dp[i][m]!=-1){
                return dp[i][m];
            }
            int nt=0+solve(a,m,i-1);
            int t=Integer.MAX_VALUE;
            if(a[i]<=m){
                t=1+solve(a,m-a[i],i);
            }
            return dp[i][m]= Math.min(t,nt);
        
    }
}