class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]-nums[i]==1){
                    ans=Math.max(ans,j-i+1);
                }else if(nums[j]-nums[i]>1){
                    break;
                }
            }
        }
        return ans;
    }
}