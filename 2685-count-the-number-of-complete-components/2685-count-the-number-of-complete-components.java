class Solution {
    List<List<Integer>> him;
    int v;
    int e;
    public int countCompleteComponents(int n, int[][] edges) {
        him = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            him.add(new ArrayList<>());
        }
        for (int a[] : edges) {
            him.get(a[0]).add(a[1]);
            him.get(a[1]).add(a[0]);
        }
        int vis[] = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            e = 0;
            v = 0;
            if (vis[i] == 0) {
                dfs(i,vis);
                if (e == (v *(v - 1))) {
                    ans++;
                }
            }

        }
        return ans;
    }

    void dfs(int i, int vis[]) {
        vis[i] = 1;
        v= v+ 1;
        e = e + him.get(i).size();
        for (int j: him.get(i)) {
            if(vis[j]==0){
                dfs(j,vis);
            }
        }

    }
}