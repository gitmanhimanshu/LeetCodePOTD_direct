class Solution {


    int pivot(int a[]){
        int s=0;
        int e=a.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(a[m]>a[e]){
                s=m+1;
            }else{
                e=m;
            }
        }
        return s;
    }
    public int search(int[] nums, int target) {
        int p=pivot(nums);
                int e=binsearch(nums,target,0,p-1);
        if(e!=-1){
            return e;
        }
        return binsearch(nums,target,p,nums.length-1);
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