class Solution {
    int pivot(int a[]){
        int s=0;
        int e=a.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(a[mid]>a[e]){
                s=s+1;
            }else{
                e=mid;
            }
        }
        return s;
    }
    public int search(int[] nums, int target) {
        int p=pivot(nums);
        int ind=search(nums,0,p-1,target);
        if(ind!=-1){
           return ind;
        }
        return search(nums,p,nums.length-1,target);
    }
    int search(int a[],int s,int e,int target){
        
        while(s<=e){
            int mid=s+(e-s)/2;
            if(a[mid]==target){
                return mid;
            }else if (a[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
}