class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans=0;
        Map<Integer,Integer> him=new HashMap<>();
        int sum=0;
        him.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int r=sum%k;
            if(r<0){
                r+=k;
            }
            if(him.containsKey(r)){
                ans+=him.get(r);
            }
            him.put(r,him.getOrDefault(r,0)+1);
        }
        return ans;
    }
}