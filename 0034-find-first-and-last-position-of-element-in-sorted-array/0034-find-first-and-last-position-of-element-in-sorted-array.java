class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = -1;
        int right = -1;
        int s = 0, r = nums.length - 1;
        while (s <= r) {
            int m = s + (r - s) / 2;
            if (nums[m] == target) {
                left = m;
                r = m - 1;
            } else if (nums[m] > target) {
                r = m - 1;
            } else {
                s = m + 1;
            }
        }
         s = 0;
         r = nums.length - 1;
        while (s <= r) {
            int m = s + (r - s) / 2;
            if (nums[m] == target) {
                right = m;
                s = m + 1;
            } else if (nums[m] > target) {
                r = m - 1;
            } else {
                s = m + 1;
            }
        }
        return new int[]{left,right};
    }

}