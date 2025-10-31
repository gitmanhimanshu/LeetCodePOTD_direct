class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0,r=nums.length-1;
        int ans=-1;
        while(l<r){
            int m=(l+r)/2;
            if(m%2==1){
                m--;
            }
            if(nums[m]==nums[m+1]){
                l=l+2;
            }else{
                r=m;
            }
        }
        return nums[r];
    }
}