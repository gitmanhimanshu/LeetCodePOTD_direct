class Solution {
    int pivot(int []nums){
        int s=0;
        int e=nums.length-1;
        while(s<e){
            while(s<nums.length-1&&nums[s]==nums[s+1]){
                s++;
            }
            while(e>1&&nums[e]==nums[e-1]){
                e--;
            }
            int mid=s+(e-s)/2;
            if(nums[mid]>nums[e]){
                s=s+1;
            }else{
                e=mid;
            }

        }
        return s;
    }
    public int findMin(int[] nums) {
        return nums[pivot(nums)];
    }
}