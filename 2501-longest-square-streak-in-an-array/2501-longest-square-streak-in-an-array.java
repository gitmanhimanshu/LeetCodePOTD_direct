class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Long> him=new HashSet<>();
        for(long i:nums){
            him.add(i);
        }
        int ans=1;
        for(int i:nums){
           int t=1;
           long j=i;
           while(him.contains(j*j)){
            t++;
            j=j*j;
           }
           ans=Math.max(t,ans);
        }
        return ans==1?-1:ans;
    }
}