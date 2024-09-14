class Solution {
    public int longestSubarray(int[] nums) {
        int ans=1;
    int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=nums[i]>max?nums[i]:max;
        }
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                c++;
                ans=Math.max(ans,c);
            }else{
                c=0;
            }
        }
        return ans;
    }
}