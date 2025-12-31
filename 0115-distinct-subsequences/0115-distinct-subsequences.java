class Solution {
    int dp[][];
    public int numDistinct(String s, String t) {
         dp=new int[s.length()][t.length()];
         for(int a[]:dp){
            Arrays.fill(a,-1);
         }
     return solve(0,s,t,0);   
    }
    int solve(int i,String s,String t,int j){
        
        if(j>=t.length()){
            return 1;
        }
        if(i>=s.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
       int ways=0;
        if(s.charAt(i)==t.charAt(j)){
             ways = solve(i+1, s, t, j+1) + solve(i+1, s, t, j);
        }else{
            ways=solve(i+1, s, t, j);
        }
        return dp[i][j]=ways;
    }
}