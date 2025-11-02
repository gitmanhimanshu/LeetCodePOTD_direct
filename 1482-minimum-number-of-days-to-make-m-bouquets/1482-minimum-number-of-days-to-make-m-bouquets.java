class Solution {
    private boolean isposs(int a[],int mid,int m,int k){
        int c=0;
        int t=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=mid){
                c++;

            }else{
                c=0;
            }
            if(c==k){
                t++;
                c=0;
            }
        }
        return t>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int min=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            if(max<bloomDay[i]){
                max=bloomDay[i];
            }
        }
        int ans=-1;
        while(min<=max){
                int mid=(min+max)/2;
                if(isposs(bloomDay,mid,m,k)){
                    ans=mid;
                    max=mid-1;
                }else{
                    min=mid+1;
                }
        }
        return ans;
    }
}