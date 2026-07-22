class SparseTable {
    private List<List<Integer>> table;

    public SparseTable(List<Integer> data) {
        table = new ArrayList<>();
        table.add(new ArrayList<>(data));
        int step = 1, size = table.get(0).size();

        while (2 * step <= size + 1) {
            List<Integer> prevLevel = table.get(table.size() - 1);
            List<Integer> currLevel = new ArrayList<>();

            for (int idx = 0; idx < size - 2 * step + 1; idx++) {
                currLevel.add(Math.max(prevLevel.get(idx), prevLevel.get(idx + step)));
            }

            table.add(currLevel);
            step <<= 1;
        }
    }

    public int query(int begin, int end) {
        if (begin > end) return 0;

        int length = end - begin + 1;
        int level = 31 - Integer.numberOfLeadingZeros(length);

        return Math.max(
            table.get(level).get(begin),
            table.get(level).get(end - (1 << level) + 1)
        );
    }
}

class Solution {

    public List<Integer> maxActiveSectionsAfterTrade(String s, int[][] queries) {
        int len = s.length();
        int onesCount = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1') onesCount++;
        }

        List<Integer> zeroBlockLens = new ArrayList<>();
        List<Integer> blockStart = new ArrayList<>();
        List<Integer> blockEnd = new ArrayList<>();

        int p = 0;

        while (p < len) {
            int start = p;

            while (p < len && s.charAt(p) == s.charAt(start)) {
                p++;
            }

            if (s.charAt(start) == '0') {
                zeroBlockLens.add(p - start);
                blockStart.add(start);
                blockEnd.add(p - 1);
            }
        }

        int blockCount = zeroBlockLens.size();

        if (blockCount < 2) {
            List<Integer> result = new ArrayList<>();
            for (int[] q : queries) result.add(onesCount);
            return result;
        }

        List<Integer> pairGain = new ArrayList<>();

        for (int k = 0; k < blockCount - 1; k++) {
            pairGain.add(zeroBlockLens.get(k) + zeroBlockLens.get(k + 1));
        }

        SparseTable sparseTable = new SparseTable(pairGain);

        List<Integer> result = new ArrayList<>();

        for (int[] q : queries) {
            int l = q[0], r = q[1];

            int lowIdx = lowerBound(blockEnd, l);
            int highIdx = upperBound(blockStart, r) - 1;

            if (lowIdx > blockCount - 1 || highIdx < 0 || lowIdx >= highIdx) {
                result.add(onesCount);
                continue;
            }

            int firstSegLen = blockEnd.get(lowIdx) - Math.max(blockStart.get(lowIdx), l) + 1;
            int lastSegLen = Math.min(blockEnd.get(highIdx), r) - blockStart.get(highIdx) + 1;

            if (lowIdx + 1 == highIdx) {
                result.add(onesCount + firstSegLen + lastSegLen);
                continue;
            }

            int optionA = firstSegLen + zeroBlockLens.get(lowIdx + 1);
            int optionB = zeroBlockLens.get(highIdx - 1) + lastSegLen;
            int optionC = sparseTable.query(lowIdx + 1, highIdx - 2);

            result.add(onesCount + Math.max(Math.max(optionA, optionB), optionC));
        }

        return result;
    }

    private int lowerBound(List<Integer> list, int target) {
        int lo = 0, hi = list.size();

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (list.get(mid) < target)
                lo = mid + 1;
            else
                hi = mid;
        }

        return lo;
    }

    private int upperBound(List<Integer> list, int target) {
        int lo = 0, hi = list.size();

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (list.get(mid) <= target)
                lo = mid + 1;
            else
                hi = mid;
        }

        return lo;
    }
}