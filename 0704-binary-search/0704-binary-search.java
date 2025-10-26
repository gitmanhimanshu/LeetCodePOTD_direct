class Solution {
    public int search(int[] nums, int target) {
        return search(nums,0,nums.length-1,target);
    }
    int search(int nums[],int s,int e,int t){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(nums[m]==t){
            return m;
        }
        if(nums[m]>t){
            return search(nums,s,m-1,t);
        }
        return search(nums,m+1,e,t);
    }
}

// class Solution {
//     public int search(int[] nums, int target) {
//         int s=0,e=nums.length-1;
//         while(s<=e){
//             int m=s+(e-s)/2;
//             if(nums[m]==target){
//                 return m;
//             }else if(nums[m]>target){
//                 e=m-1;
//             }else{
//                 s=m+1;
//             }
//         }
//         return -1;
//     }
// }