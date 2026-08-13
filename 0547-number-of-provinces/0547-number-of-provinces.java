class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        List<List<Integer>> him = new ArrayList<>();
        for(int i=0;i<n;i++){
            him.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1){
                    him.get(i).add(j);
                }
            }
        }
        int v[]=new int[n];
        int ans=0;
        for(int i=0;i<n;i++){
            if(v[i]==0){
                solve(him,v,i);
                ans++;
            }
        }
        return ans;
    }
    void solve(List<List<Integer>> him,int v[],int i){
            v[i]=1;
            for(Integer j:him.get(i)){
                if(v[j]==0){
                    solve(him,v,j);
                }
            }
    }
}