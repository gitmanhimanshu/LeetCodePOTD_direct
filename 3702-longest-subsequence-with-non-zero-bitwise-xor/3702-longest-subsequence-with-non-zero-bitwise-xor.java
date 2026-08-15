class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        int allZero=1;
        for(int i:nums){
            xor=xor^i;
            if(i!=0){
                allZero=0;
            }
        }
        if(allZero==1){
            return 0;
        }
        if(xor==0){
            return nums.length-1;
        }
        return nums.length;
    }
}