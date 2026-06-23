class Solution {
    class DSU {
        int parent[];
        int r[];

        DSU(int n){
            this.parent=new int[n+1];
            this.r=new int[n+1];
            for(int i=1;i<=n;i++){
                parent[i]=i;
            }
        }

        int findparent(int e) {
            if (parent[e] == e) {
                return e;
            }
            return parent[e] = findparent(parent[e]);
        }

        boolean union(int s, int e) {
            int ps = findparent(s);
            int pe = findparent(e);
            if (ps == pe) {
                return false;
            }
            if (r[ps] < r[pe]) {
                parent[ps] = pe;
            } else if (r[pe] < r[ps]) {
                parent[pe] = ps;
            } else {
                parent[pe] = ps;
                r[ps]++;
            }
            return true;
        }
    }

    public int[] findRedundantConnection(int[][] edges) {
            DSU d=new DSU(edges.length);
            for(int a[]:edges){
                if(!d.union(a[0],a[1])){
                    return a;
                }
            }
            return new int[0];
    }
}