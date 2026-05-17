class Solution {
    public int findCircleNum(int[][] isConnected) {
        Map<Integer,List<Integer>> him=new HashMap<>();
        for(int i=0;i<isConnected.length;i++){
            him.put(i,new ArrayList<>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected.length;j++){
                if(isConnected[i][j]==1){
                    him.get(i).add(j);
                }
            }
       
        }
         int ans=0;
        int v[]=new int[isConnected.length];
        for(int i=0;i<v.length;i++){
            if(v[i]==0){
                ans++;
                solve(v,him,i);
            }
        }
        return ans;
    }
    void solve(int v[],Map<Integer,List<Integer>> him,int i){
        for(int j:him.get(i)){
            if(v[j]==0){
                v[j]=1;
                solve(v,him,j);
            }
        }
    }
}