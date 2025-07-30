class Solution {
    public int longestSubarray(int[] nums) {
        int ans=1; 
        int max=Integer.MIN_VALUE;
        int c=0;
                for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                c++;
            }else{
            c=0;
            }
            ans=Math.max(c,ans);

        }

        return ans;
    }
}