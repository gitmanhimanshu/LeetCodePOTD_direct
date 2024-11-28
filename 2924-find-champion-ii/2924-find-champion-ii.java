class Solution {
    public int findChampion(int n, int[][] edges) {
        int in[]=new int[n];
        for(int a[]:edges){
            in[a[1]]++;
        }
        int c=0;
        int ans=-1;
        for(int i=0;i<n;i++){
            if(in[i]==0){
                ans=i;
                c++;
            }
            if(c>1){
                return -1;
            }
        }
        return ans;
    }
}