class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int n=mat.length;
        int m=mat[0].length;
        int ans[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int sum=0;
                for(int r=Math.max(0,i-k);r<=Math.min(n-1,i+k);r++){
                    for(int c=Math.max(0,j-k);c<=Math.min(m-1,j+k);c++){
                        sum+=mat[r][c];
                    }
                }
                ans[i][j]=sum;
            }
        }
        return ans;
    }
}