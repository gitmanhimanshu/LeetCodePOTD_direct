class Solution {
    int MOD = 1000000007;
    long dp[][][];

    public int subsequencePairCount(int[] nums) {
        dp=new long[nums.length+1][201][201];
        for(long b[][]:dp){
            for(long a[]:b){
                Arrays.fill(a,-1);
            }
        }
        return (int)solve(0, 0, 0, nums);
    }

    long solve(int i, int seq1, int seq2, int nums[]) {
        if (i == nums.length) {
            if ((seq1 != seq2) || (seq1 == 0 && seq2 == 0)) {
                return 0;
            }
            return 1;
        }
        if(dp[i][seq1][seq2]!=-1){
            return dp[i][seq1][seq2];
        }
        long takes1=solve(i+1,gcd(nums[i],seq1),seq2,nums);
        long takes2=solve(i+1,seq1,gcd(nums[i],seq2),nums);
        long skip=solve(i+1,seq1,seq2,nums);
        return dp[i][seq1][seq2]=(takes1%MOD+takes2%MOD+skip%MOD)%MOD;
    }
    int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}