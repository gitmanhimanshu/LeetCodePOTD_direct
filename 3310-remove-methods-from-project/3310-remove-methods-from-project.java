class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> him = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            him.add(new ArrayList<>());
        }
        for (int a[] : invocations) {
            him.get(a[0]).add(a[1]);
        }
        boolean sp[] = new boolean[n];
        boolean vis[] = new boolean[n];
        solve(sp, him, k, vis);
        List<Integer> ans = new ArrayList<>();
        boolean got = false;
        for (int a[] : invocations) {
            if (!sp[a[0]] && sp[a[1]]) {
                got = true;
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (got) {
                ans.add(i);
            } else {
                if (!sp[i]) {
                    ans.add(i);
                }
            }

        }

        return ans;
    }

    void solve(boolean a[], List<List<Integer>> him, int i, boolean vis[]) {
        a[i] = true;
        vis[i] = true;
        for (int j : him.get(i)) {
            if (!vis[j]) {
                solve(a, him, j, vis);
            }
        }
    }
}