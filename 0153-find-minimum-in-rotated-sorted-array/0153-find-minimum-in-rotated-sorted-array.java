class Solution {
    public int findMin(int[] nums) {
        
        int s=0,e=nums.length-1;
        while(s<e){
            int m=(s+e)/2;
            if(nums[m]>nums[e]){
                s=m+1;
            }else{
                e=m;
            }
        }
        return nums[e];
    }
}