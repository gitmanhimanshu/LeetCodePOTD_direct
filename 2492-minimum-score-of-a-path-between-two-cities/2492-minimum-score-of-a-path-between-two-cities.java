class Solution {
    public int minScore(int n, int[][] roads) {
        List<List<int[]>> him = new ArrayList<>();
        for (int i = 0; i < n+1; i++) {
            him.add(new ArrayList<>());
        }
        for (int a[] : roads) {
            him.get(a[0]).add(new int[] { a[1], a[2] });
            him.get(a[1]).add(new int[]{a[0],a[2]});
        }
        int v[]=new int[n+1];
        return dfs(v,him,1);
    }
    int dfs(int v[],List<List<int[]>> him,int i){
        v[i]=1;
        int r=Integer.MAX_VALUE;
        for(int a[]:him.get(i)){
            r=Math.min(r,a[1]);
            if(v[a[0]]==0){
                r=Math.min(r,dfs(v,him,a[0]));
            }
        }
        return r;
    }
}