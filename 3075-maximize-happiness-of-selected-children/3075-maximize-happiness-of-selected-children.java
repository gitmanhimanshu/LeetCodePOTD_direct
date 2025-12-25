class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int c=0;
        long ans=0L;

        for(int i=happiness.length-1;i>=0&&k>0;i--){
            ans+=(happiness[i]-c)>=0?(happiness[i]-c):0;
            c++;
            k--;
        }
        return ans;
    }
}