class Solution {
    int mod = 1000000007;

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;

        long[][] next = new long[m][2];

        for (int i = 0; i < m; i++) {
            next[i][0] = 1;
            next[i][1] = 1;
        }

        for (int len = n - 1; len >= 1; len--) {

            long[] prefix = new long[m];
            long[] suffix = new long[m];

            prefix[0] = next[0][1];
            for (int i = 1; i < m; i++) {
                prefix[i] = (prefix[i - 1] + next[i][1]) % mod;
            }

            suffix[m - 1] = next[m - 1][0];
            for (int i = m - 2; i >= 0; i--) {
                suffix[i] = (suffix[i + 1] + next[i][0]) % mod;
            }

            long[][] curr = new long[m][2];

            for (int i = 0; i < m; i++) {

                // step = 0 -> next value smaller
                curr[i][0] = (i > 0) ? prefix[i - 1] : 0;

                // step = 1 -> next value greater
                curr[i][1] = (i < m - 1) ? suffix[i + 1] : 0;
            }

            next = curr;
        }

        long ans = 0;

        for (int i = 0; i < m; i++) {
            ans = (ans + next[i][0]) % mod;
            ans = (ans + next[i][1]) % mod;
        }

        return (int) ans;
    }
}