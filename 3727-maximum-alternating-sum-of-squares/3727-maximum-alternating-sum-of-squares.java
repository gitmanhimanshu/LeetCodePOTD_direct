class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long ans=0;
        int i=0,j=nums.length-1;
        while(i<j){
            ans+= (nums[j]-nums[i]);
            i++;
            j--;
        }
        if(nums.length%2!=0){
            ans+=nums[i];
        }
        return ans;
    }
}