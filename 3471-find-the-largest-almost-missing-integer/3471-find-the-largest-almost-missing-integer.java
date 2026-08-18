class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> him = new HashMap<>();

        for (int i = 0; i <= n - k; i++) {
            Set<Integer> set = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            for (int x : set) {
                him.put(x, him.getOrDefault(x, 0) + 1);
            }
        }

        int ans = -1;

        for (int x : him.keySet()) {
            if (him.get(x) == 1) {
                ans = Math.max(ans, x);
            }
        }

        return ans;
    }
}