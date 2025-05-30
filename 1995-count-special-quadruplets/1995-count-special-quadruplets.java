class Solution {
    public int countQuadruplets(int[] nums) {
        int ans = 0;
        int n = nums.length;

       
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                  
                    for (int l = k + 1; l < n; l++) {
                        if (sum == nums[l]) {
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
