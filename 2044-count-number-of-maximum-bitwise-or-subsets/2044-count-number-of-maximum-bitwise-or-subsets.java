class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOR = 0;
        for (int i : nums) {
            maxOR |= i;
        }

        return find(0, nums, maxOR, 0);

    }

    int find(int i, int nums[], int max, int curr) {
        if (i >= nums.length) {
            if (curr == max) {
                return 1;
            } else {
                return 0;
            }
        }
        int t=find(i+1,nums,max,curr|nums[i]);
        int nt=find(i+1,nums,max,curr);
        return t+nt;

    }
}