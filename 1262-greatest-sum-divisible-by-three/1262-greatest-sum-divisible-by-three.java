class Solution {
    Integer[][] dp;

    public int maxSumDivThree(int[] nums) {
        dp = new Integer[nums.length][3];
        return solve(0, nums, 0);
    }

    int solve(int i, int[] nums, int rem) {
        if (i == nums.length) {
            return rem == 0 ? 0 : Integer.MIN_VALUE;
        }

        if (dp[i][rem] != null) return dp[i][rem];

        
        int take = nums[i] + solve(i + 1, nums, (rem + nums[i]) % 3);

    
        int nontake = solve(i + 1, nums, rem);

        return dp[i][rem] = Math.max(take, nontake);
    }
}
