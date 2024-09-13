class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int a[]=new int[arr.length];
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
            a[i]=xor;
        }
        int ans[]=new int[queries.length];
        int k=0;
        for(int b[]:queries){
            if(b[0]==0){
                ans[k++]=a[b[1]];
            }
            else{
                ans[k++]=a[b[0]-1]^a[b[1]];
            }
        }
        return ans;
    }
}