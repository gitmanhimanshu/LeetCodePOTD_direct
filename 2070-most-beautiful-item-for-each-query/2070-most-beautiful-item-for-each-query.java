class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int ans[]=new int[queries.length];
        Arrays.sort(items,(a,b)->{
            return a[0]-b[0];
        });
        int max[]=new int[items.length];
        max[0]=items[0][1];
        for(int i=1;i<items.length;i++){
          max[i]=Math.max(items[i][1],max[i-1]);
        }
        for(int i=0;i<queries.length;i++){
        int ind=solve(items,queries[i]);
        ans[i]=ind==-1?0:max[ind];
        }
        return ans;
    }
    int solve(int [][] items,int k){
        int s=0;
        int r=items.length-1;
        int ans=-1;
        while(s<=r){
            int mid=(s+r)/2;
            if(items[mid][0]<=k){
                ans=mid;
                s=mid+1;
            }else{
                r=mid-1;
            }
        }
        return ans;
    }
}