class Solution {
    public int countHillValley(int[] nums) {
        int hill=0;
        int vally=0;
        int c=0;
        for(int i=1;i<nums.length-1;i++){
              int p=i-1;
              int r=i+1;
              while(nums[r]==nums[i]&&r<nums.length-1){
                r++;
              }
                if(nums[p]<nums[i]&&nums[r]<nums[i]){
                    hill+=1;
                    
                }
                 if(nums[p]>nums[i]&&nums[r]>nums[i]){
                    vally+=1;
                    
                }
                i=r-1;
                
        }
        if(hill==0&&vally==0){
            return 0;
        }
        return hill+vally;
    }
}