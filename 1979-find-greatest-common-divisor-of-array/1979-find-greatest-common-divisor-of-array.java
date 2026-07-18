class Solution {
    public int findGCD(int[] nums) {
       int Max=Integer.MIN_VALUE;
       int Min=Integer.MAX_VALUE;
       for(int i:nums){
        Max=Math.max(Max,i);
        Min=Math.min(Min,i);
       } 
       return GCD(Max,Min);
    }
    int GCD(int a,int b){
        if(b==0){
            return a;
        }

        return GCD(b,a%b);
    }
}