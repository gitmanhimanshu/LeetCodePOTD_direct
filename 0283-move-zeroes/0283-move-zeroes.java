class Solution {
    public void moveZeroes(int[] nums) {
      
       int j=0;
       while(j<nums.length){
        int num=nums[j];
        int c=j-1;
        nums[j]=0;
        while(c>=0&&nums[c]==0){
            
            c--;
            
        }
        nums[c+1]=num;
       
       
        j++;
       } 
       
    }
}