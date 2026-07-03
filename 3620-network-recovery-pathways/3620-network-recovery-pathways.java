// class Pair implements Comparable<Pair> {
//     int e;
//     long w;

//     Pair(int e, long w) {
//         this.e = e;
//         this.w = w;
//     }

//     public int compareTo(Pair that) {
//         return Long.compare(this.w,that.w);
//     }
// }

class Solution {
    int n;

    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        List<List<int[]>> him = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        n = online.length;
        int indegree[] = new int[n];
        for (int i = 0; i < n; i++) {
            him.add(new ArrayList<>());
        }
        for (int a[] : edges) {
            if (online[a[0]] && online[a[1]]) {
                him.get(a[0]).add(new int[] { a[1], a[2] });
                max = Math.max(max, a[2]);
                indegree[a[1]]++;
            }
        }
        int[] topo = makeTopo(indegree, him);
        int s = 0;
        int e = max;
        int ans = -1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (check(mid, him, k, topo)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    int[] makeTopo(int indegree[], List<List<int[]>> him) {
        Queue<Integer> h = new LinkedList<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                h.add(i);
            }
        }
        int topo[] = new int[n];
        int i = 0;

        while (!h.isEmpty()) {
            int p = h.poll();
            topo[i++] = (p);
            List<int[]> data = him.get(p);
            for (int a[] : data) {
                indegree[a[0]]--;
                if (indegree[a[0]] == 0) {
                    h.add(a[0]);
                }
            }
        }
        return topo;
    }
    // boolean check(int mid, List<List<int[]>> him, long k) {
    //     PriorityQueue<Pair> him1 = new PriorityQueue<>();
    //     him1.add(new Pair(0, 0));
    //     long vis[] = new long[n];
    //     Arrays.fill(vis, Long.MAX_VALUE);
    //     vis[0] = 0;
    //     int res = 0;
    //     while (!him1.isEmpty()) {
    //         Pair p = him1.poll();
    //         if (p.e == n - 1) {
    //                 return p.w <= k;
    //             }
    //         List<int[]> l = him.get(p.e);
    //         for (int a[] : l) {
    //             if (a[1] < mid) {
    //                 continue;
    //             }
    //             if ((a[1] + p.w) < vis[a[0]]) {
    //                 vis[a[0]] = (a[1] + p.w);
    //                 him1.add(new Pair(a[0], vis[a[0]]));
    //             }
    //         }

    //     }
    //     return vis[n - 1] <= k;

    // }
    boolean check(int mid, List<List<int[]>> him, long k, int topo[]) {

        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);

        dist[0] = 0;

        for (int u : topo) {

            if (dist[u] == Long.MAX_VALUE)
                continue;

            for (int[] a : him.get(u)) {

                int v = a[0];
                int wt = a[1];

                if (wt < mid)
                    continue;

                if (dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }
        }

        return dist[n - 1] <= k;
    }
}