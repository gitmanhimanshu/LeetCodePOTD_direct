class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int l=1;
        int r=0;
        int ans=-1;
        if ((long)m * k > bloomDay.length) return -1;
        for (int i : bloomDay) {
            r = Math.max(r, i);
        }
        while(l<r){
            int mid=l+(r-l)/2;
            if(isPos(bloomDay,m,k,mid)){
                r=mid;
                ans=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
    boolean isPos(int a[],int m,int k,int day){
        int c=0;
        int t=0;
        for(int i:a){
            if(i<=day){
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
}