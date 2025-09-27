class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        for(int i=nums.length-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            ind=i;
            break;
        }
    }
        if(ind==-1){
          int s=0,e=nums.length-1;
    while(s<e){
        int c=nums[s];
        nums[s]=nums[e];
        nums[e]=c;
        s++;
        e--;
    }
    
            return;
        }
  for(int i=nums.length-1;i>ind;i--){
      if(nums[ind]<nums[i]){
          int c=nums[ind];
          nums[ind]=nums[i];
          nums[i]=c;
          break;
      }
  }
    int s=ind+1,e=nums.length-1;
    while(s<e){
        int c=nums[s];
        nums[s]=nums[e];
        nums[e]=c;
        s++;
        e--;
    }
    
    }
}