class Solution {
    public int splitArray(int[] nums, int k) {
        int min=0;
        int max=0;
        for(int i:nums){
            min=Math.max(i,min);
            max+=i;
        }
        int ans=-1;
        while(min<=max){
            int mid=(min+max)/2;
            if(isPos(mid,nums,k)){
                ans=mid;
                max=mid-1;

            }else{
                
                min=mid+1;
            }
        }
        return ans;
    }
    boolean isPos(int m,int a[],int k){
        int s=1;
        int c=0;
        for(int i:a){
            if((c+i)>m){
                s++;
                c=i;
            }else{
                c+=i;
            }
        }
        return s<=k;
    }
}