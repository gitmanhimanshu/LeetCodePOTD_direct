class Solution {
    int dp[];
    public int maximumJumps(int[] nums, int target) {
        dp=new int[nums.length];
        Arrays.fill(dp,-2);
        return solve(0,nums,target);
    }

    int solve(int i,int[] nums,int t){
        if(i==nums.length-1){
            return dp[i]= 0;
        }
        if(dp[i]!=-2){
            return dp[i];
        }
        int st=-1;
        for(int j=i+1;j<nums.length;j++){
           if(Math.abs(nums[j]-nums[i])<=t){
            int get=solve(j,nums,t);
            if(get!=-1)
     {       st=Math.max(st,get+1);
}
           }
            
        }
        return dp[i]= st;
    }
}