class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        // int i=0;int j=0;
        // int or=0;
        // int ans=Integer.MAX_VALUE;
        // while(j<nums.length){
        //     or=or|nums[j];
        //     while(i<=j&&or>=k){
        //         ans=Math.min(ans,j-i+1);
                
        //         or^=nums[i];
        //         i++;
        //     }
        //     j++;
        // }
        // return ans==Integer.MAX_VALUE?-1:ans;
      int[] bitCounts = new int[32];
        int left = 0, right = 0, minLength = Integer.MAX_VALUE;
        
        while (right < nums.length) {
            adjustBits(bitCounts, nums[right], 1);
            while (left <= right && calculateOr(bitCounts) >= k) {
                minLength = Math.min(minLength, right - left + 1);
                adjustBits(bitCounts, nums[left], -1);
                left++;
            }
            right++;
        }
        
        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }
    void adjustBits(int[] bitCounts, int num, int increment) {
        for (int i = 0; i < 32; i++) {
            if (((num >> i) & 1) == 1) {
                bitCounts[i] += increment;
            }
        }
    }

     int calculateOr(int[] bitCounts) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (bitCounts[i] > 0) {
                result |= (1 << i);
            }
        }
        return result;
    }
}

//715/718 passed
// class Solution {
//     public int minimumSubarrayLength(int[] nums, int k) {
//         int ans=Integer.MAX_VALUE;
//         for(int i=0;i<nums.length;i++){
//             int or=0;
//             for(int j=i;j<nums.length;j++){
//                 or=or|nums[j];
//                 if(or>=k){
//                     ans=Math.min(ans,j-i+1);
//                     break;
//                 }
//             }
//         }
//         return ans==Integer.MAX_VALUE?-1:ans;
//     }
// }