class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int MOD = 1000000007;
        int n = s.length();
        long predigits[] = new long[n + 1];
        long presum[] = new long[n + 1];
        long count[] = new long[n + 1];
        int c = 0;
        for (int i = 1; i <= n; i++) {
            int ele = s.charAt(i - 1) - '0';
            if (ele == 0) {
                predigits[i] = predigits[i - 1];
                presum[i] = presum[i - 1];
                count[i] = c;
            } else {
                predigits[i] = ((predigits[i - 1] * 10) % MOD + ele) % MOD;
                presum[i] = (presum[i - 1] + ele) % MOD;
                c++;
                count[i] = c;

            }
        }
        long pow10[] = new long[n+1];
        pow10[0] = 1;
        for (int i = 1; i <= n; i++) {
           pow10[i] = (pow10[i - 1] * 10) % MOD;
        }
        int ans[] = new int[queries.length];
        for (int i = 0; i < ans.length; i++) {
            int left= queries[i][0];
            int right=queries[i][1];
             long sum = (presum[right + 1] - presum[left] + MOD) % MOD;
            int diff=(int)(count[right+1]-count[left]);
            long numdigit =
                    (predigits[right + 1]
                    - (predigits[left] * pow10[diff]) % MOD
                    + MOD) % MOD;

            ans[i] = (int) ((sum * numdigit) % MOD);



        }
return ans;
    }
}