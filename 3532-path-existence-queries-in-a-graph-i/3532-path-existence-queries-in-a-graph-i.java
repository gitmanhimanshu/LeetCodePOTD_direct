class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int c[] = new int[n];
        boolean ans[] = new boolean[queries.length];
        int k = 0;
        for (int i = 1; i < n; i++) {
            if ((nums[i] - nums[i - 1]) > maxDiff) {
                k++;
            }
            c[i] = k;
        }
        k = 0;
        for (int a[] : queries) {
            ans[k++]=c[a[0]]==c[a[1]];
        }
        return ans;
    }
}