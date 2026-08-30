class Solution {
    public int minimumDeletions(int[] nums) {
        int maxEle=Integer.MIN_VALUE;
        int minEle=Integer.MAX_VALUE;
        int minInd=-1;
        int maxInd=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>maxEle){
                maxEle=nums[i];
                maxInd=i;
            }
            if(nums[i]<minEle){
                minEle=nums[i];
                minInd=i;
            }
        }
        int left=Math.min(maxInd,minInd);
        int right=Math.max(maxInd,minInd);
        return Math.min(
    right + 1,
    Math.min(
        n - left,
        (left + 1) + (n - right)
    )
);
    }
}