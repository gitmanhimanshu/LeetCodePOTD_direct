class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int pd=1;
        int c=0;
        int t=0;
      for(int i=0;i<nums.length||t<nums.length;){
          if(i>=nums.length){
              i=t+1;
              t=i;
              pd=1;
              continue;
          }
          pd=pd*nums[i];
          if(pd<k){
            c++;  
          }
          else{
              i=t+1;
              t=i;
              pd=1;
              continue;
          }
          
          i++;
    }
        return c;
}
}
