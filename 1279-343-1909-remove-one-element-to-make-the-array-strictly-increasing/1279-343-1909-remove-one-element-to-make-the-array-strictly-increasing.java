class Solution {
    public boolean canBeIncreasing(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
          int  prev = Integer.MIN_VALUE;
            int c=0;
            for (int j = 0; j < nums.length; j++) {
                    if(i==j){
                        continue;
                    }
                    if(prev<nums[j]){
                        c++;
                    }
                    prev=nums[j];
            }
            if(c==nums.length-1){
                return true;
            }
        }
        return false;
    }
}