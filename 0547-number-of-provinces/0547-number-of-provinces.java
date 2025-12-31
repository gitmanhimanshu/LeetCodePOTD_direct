class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> him=new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            him.add(new ArrayList<>());
            for(int j=0;j<isConnected.length;j++){
               if(isConnected[i][j]==1) him.get(i).add(j);
            }
        }
        int vis[]=new int[isConnected.length];
        int ans=0;
        for(int i=0;i<vis.length;i++ ){
            if(vis[i]==0){
                ans++;
                dfs(him,vis,i);
            }
        }
        return ans;
    }
    void dfs(List<List<Integer>> him,int []vis,int ind){
        for(int i:him.get(ind)){
            if(vis[i]==0){
                vis[i]=1;
                dfs(him,vis,i);
            }
        }
    }
}