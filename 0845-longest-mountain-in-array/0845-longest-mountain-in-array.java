class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int[] lis = new int[n];
        int[] ris = new int[n];
        
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
}
