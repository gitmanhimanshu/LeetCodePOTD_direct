class Solution {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1;
        while(l<r){
            int m=l+(r-l)/2;
            if(nums[m]>nums[r]){
                l=l+1;
            }else{
                r=m;
            }
        }
        return nums[l];
    }
}