class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        for(int i=0;i<nums.length;i++){
            int ans=find(i,nums);
            //  System.out.println(ans);
            if(ans<=k){
                return i;
            }
        }
        return -1;
    }
    int find(int i,int nums[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int k=0;k<=i;k++){
            max=Math.max(max,nums[k]);
        }
        //  System.out.println(max);
        for(int k=i;k<nums.length;k++){
            min=Math.min(min,nums[k]);
        }
        //  System.out.println(min);
        return max-min;
    }
}