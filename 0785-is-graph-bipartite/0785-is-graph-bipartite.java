class Solution {
    public boolean isBipartite(int[][] graph) {
        int color[]=new int[graph.length];
        Arrays.fill(color,-1);
        for(int i=0;i<color.length;i++){
            if(color[i]==-1){
                if(!solve(graph,0,i,color)){
                    return false;
                }
            }
        }
        return true;
    }
    boolean solve(int graph[][],int rang,int i,int color[]){
        color[i]=rang;
        for(int j:graph[i]){
            if(color[j]==-1){
                if(!solve(graph,1-rang,j,color)){
                    return false;
                }
            }else if(color[i]==color[j]){
                return false;
            }
        }
        return true;
    }
}