class Solution {
    public int maxSubArray(int[] nums) {
        int ans = 0;
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i > 0) {
                ans++;
            }
            max = Math.max(i, max);
        }
        if (ans == 0) {
            return max;
        }
        ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : nums) {
            sum += i;
            if (sum < 0) {
                sum = 0;
            }
            ans = Math.max(sum, ans);
        }
        return ans;
    }
}