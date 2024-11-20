class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long ans = 0;
        HashMap<Integer, Integer> him = new HashMap<>();
        int i = 0, j = 0;
        while (j < nums.length) {
            if (j >= k - 1) {
                sum += nums[j];
                him.put(nums[j], him.getOrDefault(nums[j], 0) + 1);
                if (him.size() == k) {
                    // for(Integer l:him.keySet()){
                    //     System.out.print(l+" ");
                    // }
                    // System.out.println();
                    ans = Math.max(ans, sum);
                }
                sum -= nums[i];
                him.put(nums[i], him.getOrDefault(nums[i], 0) - 1);
                if (him.get(nums[i]) == 0) {
                    him.remove(nums[i]);
                }
                i++;
                j++;
                continue;

            }
            sum += nums[j];
 him.put(nums[j], him.getOrDefault(nums[j], 0) + 1);
            j++;

        }
        return ans;
    }
}