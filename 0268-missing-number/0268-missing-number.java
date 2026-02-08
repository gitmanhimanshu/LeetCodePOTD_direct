class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int curr=nums[i];
            if(curr<nums.length&&nums[i]!=nums[curr]){
                int t=nums[i];
                nums[i]=nums[curr];
                nums[curr]=t;
            }else{
                i++;
            }
        }
        for( i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
}