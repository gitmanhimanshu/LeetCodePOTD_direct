class Solution {
    public int findCircleNum(int[][] isConnected) {
   List<List<Integer>> him=new ArrayList<>();
        int m=isConnected.length;
        int n=isConnected[0].length;
        for(int i=0;i<m;i++){
            him.add(new ArrayList<>());
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1){
                him.get(i).add(j);
            }
        }
        }
        int a=0;
        boolean vis[]=new boolean[n];
        for(int i=0;i<m;i++){
            if(vis[i]==false){
                a++;
                vis[i]=true;
                dfs(him,i,vis);
            }
        }
        return a;
    }
    void dfs(List<List<Integer>> him,int i,boolean vis[]){
        for(int j=0;j<him.get(i).size();j++){
            if(vis[him.get(i).get(j)]==false){
                vis[him.get(i).get(j)]=true;
                dfs(him,him.get(i).get(j),vis);
            }
        }
    }
}