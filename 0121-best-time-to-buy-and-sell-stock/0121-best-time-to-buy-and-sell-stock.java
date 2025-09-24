class Solution {
    public int maxProfit(int[] prices) {
      int min=prices[0];
     int max=0;
     for(int i:prices){
         min=Math.min(min,i);
         int profit=i-min;
         max=Math.max(profit,max);

     }
     return max;   
    }
}