class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
     Arrays.sort(nums);
     int ans=1;
     int c=1;
     for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
            continue;
        }else if(nums[i]+1==nums[i+1]){
            c++;
        }else{
            c=1;
        }
ans=Math.max(ans,c);
     }
     return ans;
        
    }
}