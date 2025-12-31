class Pair implements Comparable<Pair>{
    int e;
    long wt;
      Pair(int e, long wt) {
        this.e = e;
        this.wt = wt;
    }

    @Override
    public int compareTo(Pair o) {
        return Long.compare(this.wt , o.wt);
    }
}
class Solution {
    int mod = 1000000007;

    public int countPaths(int n, int[][] roads) {
        ArrayList<ArrayList<int[]>> him = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            him.add(new ArrayList<>());
        }
        for (int[] a : roads) {
            him.get(a[0]).add(new int[]{a[1], a[2]});
            him.get(a[1]).add(new int[]{a[0], a[2]});
        }

        PriorityQueue<Pair> him1 = new PriorityQueue<>();
        int[] vis = new int[n];
        int[] w = new int[n];
       long[] ans = new long[n];

        Arrays.fill(ans, Long.MAX_VALUE / 2);
        ans[0] = 0L;
        w[0] = 1;

        him1.add(new Pair(0, 0));

        while (!him1.isEmpty()) {
            Pair k = him1.poll();
            if (vis[k.e] == 1) {
                continue;
            }
            vis[k.e] = 1;
            ans[k.e] = k.wt;

            for (int[] a : him.get(k.e)) {
                if (ans[a[0]] > (ans[k.e] + a[1]) && vis[a[0]] == 0) {
                    ans[a[0]] = ans[k.e] + a[1];
                    him1.add(new Pair(a[0], ans[k.e] + a[1]));
                    w[a[0]] = w[k.e] % mod;
                } else if (ans[a[0]] == (ans[k.e] + a[1])) {
                    w[a[0]] = (w[k.e] % mod + w[a[0]] % mod) % mod;
                }
            }
        }
        return w[n - 1];
    }

}