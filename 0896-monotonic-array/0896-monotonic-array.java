class Solution {
    public boolean isMonotonic(int[] nums) {
        // int cg=0;
        // int cs=0;
        // for(int i=0;i<nums.length;i++){
        //     int a=0;
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]>nums[j]){
        //             a++;
        //             break;
        //         }
        //     }
        //     if(a==0){
        //         cg++;
        //     }
        // }
        //   for(int i=0;i<nums.length;i++){
        //     int a=0;
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]<nums[j]){
        //             a++;
        //             break;
        //         }
        //     }
        //     if(a==0){
        //         cs++;
        //     }
        // }
        // if(cg==nums.length||cs==nums.length){
        //     return true;
        // }
        // return false;
        int a=0;
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=min){
                a++;
              }
              min=nums[i];
        }
        int b=0;
        min=nums[0];
         for(int i=1;i<nums.length;i++){
            if(nums[i]<=min){
                b++;
              }
              min=nums[i];
        }
        if(a==nums.length-1||b==nums.length-1){
            return true;
        }
        return false;
    }
}