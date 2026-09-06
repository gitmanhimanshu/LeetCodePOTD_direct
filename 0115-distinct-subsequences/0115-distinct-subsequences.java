class Solution {
    int dp[][];
    public int numDistinct(String s, String t) {
            dp=new int[s.length()+1][t.length()+1];
            for(int a[]:dp){
                Arrays.fill(a,-1);
            }
        return solve(0,0,s,t);
    }
    int solve(int i,int j,String s,String t){
        if(j>=t.length()){
            return 1;
        }
        if(i>=s.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int sum=0;
        if(s.charAt(i)==t.charAt(j)){
            sum+=solve(i+1,j+1,s,t);
        }
        sum+=solve(i+1,j,s,t);
        return dp[i][j]=sum;
    }
}