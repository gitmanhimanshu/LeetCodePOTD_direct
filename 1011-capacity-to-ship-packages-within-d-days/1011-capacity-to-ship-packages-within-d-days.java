class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=Integer.MIN_VALUE;
        int r=0;
        for(int i:weights){
            r+=i;
            l=Math.max(l,i);
        }
        while(l<r){
            int m=l+(r-l)/2;
            if(isPack(weights,m,days)){
                r=m;
            }else{
                l=m+1;
            }
        }
        return l;
    }
    boolean isPack(int a[],int m,int days){
        int c=0;
        int t=01;
        for(int i:a){
              c+=i;
            if(c>m){
                 c=i;
                t++;
               
            }
        }
        return t<=days;
    }

        //      int c=1;
    //         int sum=0;
    //         for(int i:weights){
    //             sum+=i;
    //             if(sum>mid){
    //                 sum=i;
    //                 c++;
    //             }
    //         }
    //         return c<=days;
    // }
}