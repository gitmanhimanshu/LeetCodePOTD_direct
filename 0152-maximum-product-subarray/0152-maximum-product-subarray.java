class Solution {
    public int maxProduct(int[] nums) {
        int left = 1;
        int right = 1;

        int ans = Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        // left=(left==0?1:left)*nums[i];
        // right=(right==0?1:right)*nums[nums.length-i-1];
        //     ans=Math.max(ans,Math.max(left,right));
        // }
        for (int i : nums) {
            if (left == 0) {
                left = 1;

            } 
            left = left * i;
            
            ans = Math.max(ans, left);
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (right == 0) {
                right = 1;

            }
            right=right*nums[i];

             ans = Math.max(ans, right);
        }
        return ans;
    }
}