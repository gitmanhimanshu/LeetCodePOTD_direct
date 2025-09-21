class Solution {
    public int removeDuplicates(int[] nums) {
       int ans[]=new int[nums.length];
       int j=0;
ans[0]=nums[0];
       for(int i=1;i<nums.length;i++){
        if(nums[i]!=ans[j]){
            ans[++j]=nums[i];
        }
       }
       for(int i=0;i<nums.length;i++){
        nums[i]=ans[i];
       }
       return j+1;
     
    }
}