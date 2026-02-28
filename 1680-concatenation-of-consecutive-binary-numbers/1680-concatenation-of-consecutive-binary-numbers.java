class Solution {
    public int concatenatedBinary(int n) {
        int bin=0;
        int mod=1000000007;
        long ans=0;
        for(int i=1;i<=n;i++){
            if((i&(i-1))==0){
                bin++;
            }
            ans=((ans<<bin) +i)%mod;
        }
        return (int)ans%mod;
    }
}