class Solution {
    public int maxSumDivThree(int[] nums) {
       return solve(0,nums,0);
    }
    int solve(int i,int nums[],int sum){
        if(i==nums.length){
            if (sum%3==0){
                return sum;
            }
            return Integer.MIN_VALUE;
        }
        int take=solve(i+1,nums,sum+nums[i]);
        int nontake=solve(i+1,nums,sum);
        return Math.max(take,nontake);
    }
}