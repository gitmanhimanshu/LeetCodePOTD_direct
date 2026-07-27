class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int second=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                second=max;
               max=nums[i];
            }else if(second<nums[i]){
                second=nums[i];
            }
        }
        return (max-1) * (second -1);
    }
}