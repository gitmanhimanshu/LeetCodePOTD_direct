
class Pair implements Comparable<Pair> {
    int key;
    int value;

    Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int compareTo(Pair that) {
        return this.value - that.value;
    }
}

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> him = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            him.add(new ArrayList<>());
        }
        for (int a[] : times) {
            him.get(a[0]).add(new int[] { a[1], a[2] });
        }
        int des[] = new int[n + 1];
        Arrays.fill(des, Integer.MAX_VALUE);
        des[k] = 0;
        PriorityQueue<Pair> q = new PriorityQueue<>();
        int ans = 0;
        q.add(new Pair(k, 0));

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int i = p.key;
            int val = p.value;
            if (val > des[i]) {
            continue;
        }
            List<int[]> ele = him.get(i);
            for (int a[] : ele) {
                int new_i = a[0];
                int new_val = val + a[1];
                if (new_val < des[new_i]) {
                    des[new_i] = new_val;
                    q.add(new Pair(new_i, new_val));
                }

            }
        }
        for (int i = 1; i <= n; i++) {
            if (des[i] == Integer.MAX_VALUE) {
                return -1;
            }
            ans = Math.max(ans, des[i]);
        }
        return ans;
    }
}