class Solution {
    int[] parent = new int[26];
    int[] rank = new int[26];

    int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }

    void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);
        if (pa == pb) return;

        if (rank[pa] < rank[pb]) {
            parent[pa] = pb;
        } else if (rank[pa] > rank[pb]) {
            parent[pb] = pa;
        } else {
            parent[pb] = pa;
            rank[pa]++;
        }
    }

    public boolean equationsPossible(String[] equations) {
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        // 1) Union all ==
        for (String s : equations) {
            if (s.charAt(1) == '=') {
                int x = s.charAt(0) - 'a';
                int y = s.charAt(3) - 'a';
                union(x, y);
            }
        }

        // 2) Check all !=
        for (String s : equations) {
            if (s.charAt(1) == '!') {
                int x = s.charAt(0) - 'a';
                int y = s.charAt(3) - 'a';
                if (find(x) == find(y)) return false;
            }
        }

        return true;
    }
}
