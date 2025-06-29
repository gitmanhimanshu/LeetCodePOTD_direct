class Solution {
     int mod=1000000007;;
    public int numSubseq(int[] nums, int target) {
         Arrays.sort(nums);
         int p[]=new int[nums.length];
         p[0]=1;
         for(int i=1;i<p.length;i++){
            p[i]=(p[i-1]*2) % mod;;
         }
          int i=0;
          int j=nums.length-1;
          int ans=0;
           while(i<=j){
            if(nums[i]+nums[j]<=target){
                 ans = (ans + (p[j-i])) % mod;
                  i++;
            }else{
                j--;

            }
    }
    return ans;}

}
// class Solution {
//     int mod=1000000007;;
//     public int numSubseq(int[] nums, int target) {
//         Arrays.sort(nums);
//     int i=0;
//     int ans=0;
//     int j=nums.length-1;
//     while(i<=j){

//         if(nums[i]+nums[j]<=target){
//             ans = (ans + power(2, j - i)) % mod;
//             i++;
//         }else{
//             j--;
//         }
//     }
//     return ans%mod;
//     }
//         private int power(int base, int exp) {
//         long result = 1;
//         long b = base;

//         while (exp > 0) {
//             if ((exp & 1) == 1) {
//                 result = (result * b) % mod;
//             }
//             b = (b * b) % mod;
//             exp >>= 1;
//         }

//         return (int) result;
//     }
// }