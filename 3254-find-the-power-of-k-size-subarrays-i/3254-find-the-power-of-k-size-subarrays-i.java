class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int ans[]=new int[nums.length-k+1];
       for(int i=0;i<nums.length-k+1;i++){
        int c=1;
        for(int j=i;j<(i+k)-1;j++){
            if(nums[j]==nums[j+1]-1){
                c++;
            }
        }
        if(c==k){
            ans[i]=nums[i+k-1];
        }else{
            ans[i]=-1;
        }
       }
       return ans;
    }
}