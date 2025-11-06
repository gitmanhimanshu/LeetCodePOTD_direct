class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
     int min=1;
     int max=Integer.MIN_VALUE;
     for(int i:nums){
        max=Math.max(i,max);
     }   

     int ans=-1;
     while(min<=max){
        int mid=(min+max)/2;
        if(isPossible(nums,threshold,mid)){
            ans=mid;
            max=mid-1;
        }else{
            min=mid+1;
        }
     }
     return ans;
    }

    boolean isPossible(int nums[],int l,int n){
        int c=0;
        for(int i:nums){
            c+=i/n;
            if(i%n!=0){c++;}
        }
        return c<=l;
    }
}