class Solution {
    int mod = 1000000007;

    public int countGoodNumbers(long n) {
        return (int)(solve(5, (n + 1) / 2L)%mod * solve(4, (n / 2L))%mod)%mod;
    }

  long solve(int x, long n) {
        if (n == 0) {
                return 1;
        }
        long half=solve(x,n/2)%mod;
        if(n%2==1){
            return (x*((half*half)%mod))%mod;
        }
        return (half*half)%mod;
    }
}