class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int ans=0;
        for(int i:prices){
            min=Math.min(min,i);
            ans=Math.max(ans,i-min);
        }
        return ans;

    }
}