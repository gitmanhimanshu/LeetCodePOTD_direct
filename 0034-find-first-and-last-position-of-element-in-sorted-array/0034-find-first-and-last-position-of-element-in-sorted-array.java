class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int [2];
        ans[0]=leftbin(nums,target);
        ans[1]=rightbin(nums,target);
        return ans;
    }
    int leftbin(int a[],int target){
        int s=0;
        int e=a.length-1;
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(a[mid]==target){
                ans=mid;
                e=mid-1;
            }
            else if(a[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
            
        }
        return ans;
    }
    int rightbin(int a[],int target){
        int s=0;
        int e=a.length-1;
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(a[mid]==target){
                ans=mid;
                s=mid+1;
            }
            else if(a[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
            
        }
        return ans;
    }
}