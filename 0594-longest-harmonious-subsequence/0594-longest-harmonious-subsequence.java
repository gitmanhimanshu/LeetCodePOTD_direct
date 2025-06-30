class Solution {
    public int findLHS(int[] nums) {
        int i=0;
        int j=0;
        int ans=0;
        Arrays.sort(nums);
        while(j<nums.length){
                while(i<nums.length&&(nums[j]-nums[i]>1)){
                    i++;
                }
                if(nums[i]==nums[j]){
                    j++;
                    continue;
                }
                ans=Math.max(ans,j-i+1);
                j++;
        }
        return ans;
    }
}
// class Solution {
//     public int findLHS(int[] nums) {
//         Arrays.sort(nums);
//         int ans=0;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[j]-nums[i]==1){
//                     ans=Math.max(ans,j-i+1);
//                 }else if(nums[j]-nums[i]>1){
//                     break;
//                 }
//             }
//         }
//         return ans;
//     }
// }