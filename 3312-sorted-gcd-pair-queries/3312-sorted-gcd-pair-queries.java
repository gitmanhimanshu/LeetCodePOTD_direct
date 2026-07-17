class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int maxVal = 0;
        for (int x : nums) maxVal = Math.max(maxVal, x);

        // step 1: frequency of each value
        int[] cnt = new int[maxVal + 1];
        for (int x : nums) cnt[x]++;

        // step 2 & 3: pairs whose gcd is EXACTLY g
        long[] exact = new long[maxVal + 1];
        for (int g = maxVal; g >= 1; g--) {
            long m = 0;
            for (int mult = g; mult <= maxVal; mult += g) {
                m += cnt[mult];                 // numbers divisible by g
            }
            exact[g] = m * (m - 1) / 2;         // gcd is a multiple of g
            for (int mult = 2 * g; mult <= maxVal; mult += g) {
                exact[g] -= exact[mult];        // remove gcd = 2g, 3g, ...
            }
        }

        // step 4: prefix sum -> sorted gcd array ka compressed form
        long[] prefix = new long[maxVal + 1];
        for (int g = 1; g <= maxVal; g++) {
            prefix[g] = prefix[g - 1] + exact[g];
        }

        // answer queries with binary search
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            long q = queries[i];
            int lo = 1, hi = maxVal;
            while (lo < hi) {
                int mid = (lo + hi) / 2;
                if (prefix[mid] > q) hi = mid;
                else lo = mid + 1;
            }
            ans[i] = lo;
        }
        return ans;
    }
}