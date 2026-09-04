class Solution {
    public int firstStableIndex(int[] nums, int k) {



        int leftMax[]=new int[nums.length];
        int rightMin[]=new int[nums.length];
        leftMax[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            leftMax[i]=Math.max(leftMax[i-1],nums[i]);
        }
        rightMin[rightMin.length-1]=nums[rightMin.length-1];
        for(int i=nums.length-2;i>=0;i--){
            rightMin[i]=Math.min(rightMin[i+1],nums[i]);
        }
        // System.out.println(Arrays.toString(leftMax));
        // System.out.println(Arrays.toString(rightMin));
        for(int i=0;i<nums.length;i++){
            if((leftMax[i]-rightMin[i] )<=k){
                return i;
            }
        }
        return -1;
        
    //     for(int i=0;i<nums.length;i++){
    //         int ans=find(i,nums);
    //         //  System.out.println(ans);
    //         if(ans<=k){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    // int find(int i,int nums[]){
    //     int max=Integer.MIN_VALUE;
    //     int min=Integer.MAX_VALUE;
    //     for(int k=0;k<=i;k++){
    //         max=Math.max(max,nums[k]);
    //     }
    //     //  System.out.println(max);
    //     for(int k=i;k<nums.length;k++){
    //         min=Math.min(min,nums[k]);
    //     }
    //     //  System.out.println(min);
    //     return max-min;
    // }
}
}