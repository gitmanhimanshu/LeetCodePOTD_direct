class Solution {
    Integer dp[];
    int mod = 1000000007;

    public int countGoodStrings(int low, int high, int zero, int one) {
        dp = new Integer[high + 1];
        return solve(low, high, zero, one, 0);
    }

    int solve(int low, int high, int zero, int one, int s) {
        if (s > high) {
            return 0;
        }
        if (dp[s] != null) {
            return dp[s];
        }
        int c = s >= low ? 1 : 0;
        c = (c + solve(low, high, zero, one, s + zero)) % mod;
        c = (c + solve(low, high, zero, one, s + one)) % mod;
        return dp[s] = c;
    }
}
