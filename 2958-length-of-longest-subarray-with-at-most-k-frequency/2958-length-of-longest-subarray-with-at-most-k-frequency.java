class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> him=new HashMap<>();
        int ans=Integer.MIN_VALUE;
        int l=0;
        for(int i=0;i<nums.length;i++){
            him.put(nums[i],him.getOrDefault(nums[i],0)+1);
            while(him.get(nums[i])>k){
                him.put(nums[l],him.getOrDefault(nums[l],0)-1);
                if(him.get(nums[l])==0){
                    him.remove(nums[l]);
                }
                l++;
            }
            ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}