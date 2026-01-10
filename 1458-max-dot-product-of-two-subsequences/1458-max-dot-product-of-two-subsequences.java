class Solution {
    int dp[][];

    public int maxDotProduct(int[] nums1, int[] nums2) {
        dp = new int[nums1.length + 1][nums2.length + 1];
        for (int a[] : dp) {
                Arrays.fill(a,-1);
        }
        return solve(0, 0, nums1, nums2);
    }

    int solve(int i,int j,int a[],int b[]){
        if(i>=a.length||j>=b.length){
            return Integer.MIN_VALUE;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int taken=a[i]*b[j]+Math.max(0,solve(i+1,j+1,a,b));
        int ir=solve(i,j+1,a,b);
        int jr=solve(i+1,j,a,b);
        return dp[i][j]= Math.max(taken,Math.max(ir,jr));
    }
}