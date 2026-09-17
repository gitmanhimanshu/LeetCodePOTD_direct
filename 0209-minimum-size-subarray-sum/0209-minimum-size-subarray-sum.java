class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;

        int j=0;
        int ans=Integer.MAX_VALUE;
        int sum=0;

        while(j<nums.length){
            sum+=nums[j];
            int a=0;
            while(sum>target){
                sum-=nums[i];
                i++;
                a=1;

            }
            if(sum>=target){
                ans=Math.min(ans,j-i+1);
            }
            if(a==1&&sum<target){
                ans=Math.min(ans,j-i+2);
            }
            j++;

        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}