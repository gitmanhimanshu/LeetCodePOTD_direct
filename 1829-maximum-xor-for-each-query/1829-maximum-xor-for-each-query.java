class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int ans[]=new int [nums.length];
        int n=nums.length;
        int x=0;
        for(int i:nums){
            x^=i;
        }
        int mask=(1<<maximumBit)-1;
        for(int i=0;i<nums.length;i++){
            int k=x^mask;
            ans[i]=k;
            x^=nums[n-i-1];
        }
return ans;
    }
}

// brute force 71/86 passed
//class Solution {
//     public int[] getMaximumXor(int[] nums, int maximumBit) {
//         int k = (int) Math.pow(2, maximumBit);
//         int xor = 0;
//         for (int i = 0; i < nums.length; i++) {
//             xor = xor ^ nums[i];
//         }
//         int j = nums.length - 1;
//         int ans[] = new int[nums.length];
//         for (int i = 0; i < nums.length; i++) {
//             int l = 0;
//             int maxL = 0;
//             int tempx = -1;
//             while (l < k) {
//                 if ((xor ^ l) > tempx) {
//                     tempx = xor ^ k;
//                     maxL = l;
//                 }
//                 l++;
//                 ans[i] = maxL;
//             }
//             xor = xor ^ nums[j--];
//         }
//         return ans;
//     }
// }