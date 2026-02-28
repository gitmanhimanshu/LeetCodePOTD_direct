class Solution:
    def concatenatedBinary(self, n: int) -> int:
        ans=0
        bin=0
        MOD = 1000000007
        for i in range(1,n+1):
            if ((i&(i-1))==0):
                bin+=1
            ans =((ans<<bin)+i)%MOD
        return ans%MOD
        









# class Solution {
#     public int concatenatedBinary(int n) {
#         int bin=0;
#         int mod=1000000007;
#         long ans=0;
#         for(int i=1;i<=n;i++){
#             if((i&(i-1))==0){
#                 bin++;
#             }
#             ans=((ans<<bin) +i)%mod;
#         }
#         return (int)ans%mod;
#     }
# }