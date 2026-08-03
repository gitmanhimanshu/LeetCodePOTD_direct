class Solution {
    int dp[];
    public String stoneGameIII(int[] stoneValue) {
    dp=new int[stoneValue.length];
        Arrays.fill(dp,-1);
     
     int diff=solve(0,stoneValue);
     if(diff>0){
        return "Alice";
     }   
     else if(diff<0){
        return "Bob";
     }
     return "Tie";
    }
    int solve(int i,int a[]){
        if(i>=a.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int r=Integer.MIN_VALUE;
        r=a[i]-solve(i+1,a);
        if ((i+1)<a.length)
        r=Math.max(r,a[i]+a[i+1]-solve(i+2,a));
         if((i+2)<a.length)
         r=Math.max(r,a[i]+a[i+1]+a[i+2]-solve(i+3,a));
         

         return dp[i]=r;

    }
}