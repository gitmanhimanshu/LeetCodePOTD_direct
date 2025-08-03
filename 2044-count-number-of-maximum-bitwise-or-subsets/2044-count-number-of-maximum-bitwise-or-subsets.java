class Solution {
    int m=0;
    int dp[][];
    public int countMaxOrSubsets(int[] nums) {
        int max = 0;
        for (int i : nums) {
            max |= i;
        }
        m=max;
        dp=new int[nums.length+1][max+1];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        return find(0,nums,0);
    }
    // int find(int i,int []nums,int maxOr){
    //     if(i==nums.length){
    //         return maxOr==m?1:0;
    //     }
    //     int in=find(i+1,nums,nums[i]|maxOr);
    //     int ex=find(i+1,nums,maxOr);
    //     return in+ex;
    // }
      int find(int i,int []nums,int maxOr){
        if(i==nums.length){
            return maxOr==m?1:0;
        }
        if(dp[i][maxOr]!=-1){
            return dp[i][maxOr];
        }
        int in=find(i+1,nums,nums[i]|maxOr);
        int ex=find(i+1,nums,maxOr);
        return dp[i][maxOr]= in+ex;
    }
}