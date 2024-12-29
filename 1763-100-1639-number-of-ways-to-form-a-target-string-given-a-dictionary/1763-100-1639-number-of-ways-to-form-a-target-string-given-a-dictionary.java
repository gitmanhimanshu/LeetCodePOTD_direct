class Solution {
    int k;
    int m;
    int mod = 1000000007;
    int dp[][];

    public int numWays(String[] words, String target) {
        m = target.length();
        k = words[0].length();
        int[][] f = new int[26][k];
        dp = new int[m][k];
        for (int a[] : dp) {
            Arrays.fill(a, -1);
        }
        for (int i = 0; i < k; i++) {
            for (String w : words) {
                f[w.charAt(i) - 'a'][i]++;
            }
        }
        return solve(0, 0, target, f);
    }

    int solve(int i, int j, String target, int[][] f) {
        if (i == m)
            return 1;
        if (j == k)
            return 0;
        if (dp[i][j] != -1) {
            return dp[i][j] % mod;
        }
        int nt = solve(i, j + 1, target, f);
        int t = (int) ((long) f[target.charAt(i) - 'a'][j] * solve(i + 1, j + 1, target, f) % mod);
        return dp[i][j] = (t + nt) % mod;
    }
}
