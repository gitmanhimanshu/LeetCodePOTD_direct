class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[]=new int[nums.length];
        int i=0;
        int j=1;
        for(int in:nums){
            if(in<0){
            ans[j]=in;
            j+=2;
            }else{
                ans[i]=in;
                i+=2;
            }
        }
        return ans;

    }
}