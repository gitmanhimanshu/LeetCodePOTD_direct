class Solution {
    Map<String, Integer> him;

    public int longestMountain(int[] arr) {
        int n = arr.length;
     //   him = new HashMap<>();
        int[] lis = new int[n];
        int[] ris = new int[n];

        // int ans = 0;
        // for (int i = 0; i < n; i++) {
        //     lis[i] = prevdec(arr, i, i - 1);
        // }
        // for (int i = 1; i < n - 1; i++) {
        //     ris[i] = aageincreasing(arr, i, i + 1);
        // }
        // for (int i = 0; i < n; i++) {
        //     if (lis[i] > 0 && ris[i] > 0) {
        //         ans = Math.max(ans, lis[i] + ris[i] + 1); 
        //     }
        // }

        Arrays.fill(lis, 1);
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                lis[i] = lis[i - 1] + 1;
            }
        }

        Arrays.fill(ris, 1);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                ris[i] = ris[i + 1] + 1;
            }
        }

        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            if (lis[i] > 1 && ris[i] > 1) {
                ans = Math.max(ans, lis[i] + ris[i] - 1);
            }
        }

        return ans;
        
    }

    // int prevdec(int[] nums, int p, int i) {
    //     if (i < 0 || nums[i] >= nums[p]) return 0;

    //     String key = "dec-" + p + "," + i;
    //     if (him.containsKey(key)) return him.get(key);

    //     int result = 1 + prevdec(nums, i, i - 1);
    //     him.put(key, result);
    //     return result;
    // }

    // int aageincreasing(int[] nums, int p, int i) {
    //     if (i >= nums.length || nums[i] >= nums[p]) return 0;

    //     String key = "inc-" + p + "," + i;
    //     if (him.containsKey(key)) return him.get(key);

    //     int result = 1 + aageincreasing(nums, i, i + 1);
    //     him.put(key, result);
    //     return result;
    // }
}
