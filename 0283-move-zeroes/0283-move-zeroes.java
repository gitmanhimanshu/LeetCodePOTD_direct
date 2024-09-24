class Solution {
    public void moveZeroes(int[] nums) {
        int ans[]=new int[nums.length];
        // intially all elements are zero by default .. ans=[0,0,0,0,0];
        int k=0; // take k variable for storinng nonzero count in ans array
        for(int i=0;i<nums.length;i++){
            // if(elements is non zero then add in to ans array
            if(nums[i]!=0){
                ans[k]=nums[i]; // we store in ans kth position beacuase for only nonzero element
                k++;                    // increment k if nonzero meet 
            }
        }
// after loop ans=[1,3,12,0,0,0] beacause we adding nonzero only in ans variable
  for(int i=0;i<ans.length;i++){
    nums[i]=ans[i];   // copy all element from final array to initial array
  }

//  for intput [2,4,0,0,0,7,0,9,0,0,0,0] 
//  answer should be [2,4,7,9,0,0,0,0,0,0,0...]
    }
}