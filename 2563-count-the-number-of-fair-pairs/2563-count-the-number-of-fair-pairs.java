class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        long ans = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j <= k) {
                int mid = j + (k - j) / 2;
                if (nums[i] + nums[mid] >= lower) k = mid - 1;
                else j = mid + 1;
            }
            int start = j;

            j = i + 1;
            k = nums.length - 1;
            while (j <= k) {
                int mid = j + (k - j) / 2;
                if (nums[i] + nums[mid] <= upper) j = mid + 1;
                else k = mid - 1;
            }
            int end = k;

            if (start <= end) ans += end - start + 1;
        }
        return ans;
    }
}


    // public long countFairPairs(int[] nums, int lower, int upper) {
    // long ans=0;
    // int n=nums.length;
    // for(int i=0;i<nums.length;i++){
    //     for(int j=i+1;j<nums.length;j++){
    //         int c=nums[i]+nums[j];
    //         if(c>=lower&&c<=upper){
    //             ans++;
    //         }
    //     }
    // }
    // return ans;
    // }
