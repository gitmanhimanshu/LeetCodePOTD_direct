class Solution {
    public long findKthSmallest(int[] coins, int k) {
        int n = coins.length;

        // precompute LCM for every non-empty subset of coins once
        int subsetCount = 1 << n;
        long[] subsetLcm = new long[subsetCount];
        long BIG = (long) 4e18; // acts as "infinity" so oversized lcms don't wrap around

        for (int mask = 1; mask < subsetCount; mask++) {
            int lowestBit = mask & (-mask);
            int idx = Integer.numberOfTrailingZeros(lowestBit);
            int rest = mask ^ lowestBit;

            long prevLcm = (rest == 0) ? 1 : subsetLcm[rest];
            subsetLcm[mask] = safeLcm(prevLcm, coins[idx], BIG);
        }

        long left = 1;
        long right = (long) coins[0] * k; // guaranteed to be a valid upper bound

        while (left < right) {
            long mid = left + (right - left) / 2;
            if (countValidAmounts(subsetLcm, mid) >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    // inclusion-exclusion: how many numbers in [1, limit] are divisible by
    // at least one coin
    private long countValidAmounts(long[] subsetLcm, long limit) {
        long total = 0;

        for (int mask = 1; mask < subsetLcm.length; mask++) {
            long lcm = subsetLcm[mask];
            if (lcm > limit) continue; // contributes zero, skip it

            long contribution = limit / lcm;
            boolean oddSizedSubset = (Integer.bitCount(mask) & 1) == 1;

            total += oddSizedSubset ? contribution : -contribution;
        }

        return total;
    }

    private long safeLcm(long a, long b, long cap) {
        long g = gcd(a, b);
        long scaled = a / g;
        // if this multiplication would blow past our cap, just clamp it —
        // we only care that it's "too big to matter" anyway
        if (scaled > cap / b) return cap;
        return scaled * b;
    }

    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}