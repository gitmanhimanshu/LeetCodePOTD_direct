class Solution {
       int pivot(int a[]){
        int l=0;
        int r=a.length-1;
        while(l<r){
            while(l<r&&a[l]==a[l+1]){
                l++;
            }
               while(l<r&&a[r]==a[r-1]){
                r--;
            }
            int m=(l+r)/2;
            if(a[m]>a[r]){
                l=m+1;
            }else{
                r=m;
            }
        }
        return r;
       }
    public boolean search(int[] nums, int target) {
        int p=pivot(nums);
      //  System.out.println(p);
        int e=binsearch(nums,target,0,p-1);
        if(e!=-1){
            return true;
        }
        return binsearch(nums,target,p,nums.length-1)!=-1;
    }
     int binsearch(int a[],int ele,int s,int e){
        while(s<=e){
            int mid=(s+e)/2;
            if(a[mid]==ele){
                return mid;
            }else if(a[mid]>ele){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
}