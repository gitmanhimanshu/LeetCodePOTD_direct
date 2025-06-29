class Solution {
    int mod=1000000007;;
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
    int i=0;
    int ans=0;
    int j=nums.length-1;
    while(i<=j){

        if(nums[i]+nums[j]<=target){
            ans = (ans + power(2, j - i)) % mod;
            i++;
        }else{
            j--;
        }
    }
    return ans%mod;
    }
        private int power(int base, int exp) {
        long result = 1;
        long b = base;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * b) % mod;
            }
            b = (b * b) % mod;
            exp >>= 1;
        }

        return (int) result;
    }
}