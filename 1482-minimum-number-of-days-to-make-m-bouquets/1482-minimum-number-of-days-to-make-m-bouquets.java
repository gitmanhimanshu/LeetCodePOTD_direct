class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int min=1;
        int max=Integer.MIN_VALUE;
        for(int i:bloomDay){
            max=Math.max(max,i);
        }
int ans=-1;
        while(min<=max){
            int mid=(min+max)/2;
            if(ispass(mid,bloomDay,m,k)){
                ans=mid;
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return ans;
    }

boolean ispass(int day,int a[],int m,int k){
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