class Solution {
    public int minimumEffort(int[][] tasks) {
        int s=0;
        int r=(int)1e9;
        Arrays.sort(tasks,(a,b)->{
           int diff1=a[1]-a[0];
           int diff2=b[1]-b[0];
            return diff2-diff1;
        });
        int ans=-1;
        while(s<=r){
            int mid=s+(r-s)/2;
            if(isPoss(tasks,mid)){
                ans=mid;
                r=mid-1;
            }else{
                s=mid+1;

            }
        }
        return ans;
    }
    Boolean isPoss(int tasks[][],int mid){
        for(int a[]:tasks){
            int actual=a[0];
            int need=a[1];
            if(need>mid){
                return false;
            }
            mid-=actual;
        }
        return true;
    }
}