class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,maxsum=0,a=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]>0){
                a++;
                break;
            }
        }
        if(a==0){
            return max;
        }
        
        for(int i=0;i<nums.length;i++){
            if(sum<0){
                sum=nums[i];
            }
            else{
                sum+=nums[i];
            }
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }
}