class Solution {
    int dp[][];
    public int stoneGameV(int[] stoneValue) {
        int sum[] = new int[stoneValue.length];
        dp=new int[sum.length][sum.length];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        sum[0] = stoneValue[0];
        for (int i = 1; i < stoneValue.length; i++) {
            sum[i] = stoneValue[i] + sum[i - 1];
        }
        return solve(0, sum.length - 1, sum, stoneValue);
    }

    int solve(int l,int r,int sum[],int a[]){
        if(l>=r){
            return 0;
        }
        if(dp[l][r]!=-1){
            return dp[l][r];
        }
        int res=0;
        for(int i=l;i<r;i++){
             int left=   sum[i]- (((l-1)>=0)?sum[l-1]:0);
             int right=sum[r]-sum[i];
             if(left>right){
                res=Math.max(res,right+solve(i+1,r,sum,a));
             }else if(right>left){
                res=Math.max(res,left+solve(l,i,sum,a));
             }else{
                res=Math.max(res,Math.max(right+solve(l,i,sum,a),left+solve(i+1,r,sum,a)));
             }
        }
        return dp[l][r]=res;

        
    }
}