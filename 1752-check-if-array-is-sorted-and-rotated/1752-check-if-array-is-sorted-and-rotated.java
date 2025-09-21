class Solution {
    public boolean check(int[] nums) {
        int ind=-1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                ind=i+1;
                break;
            }
        }
        if(ind==-1){
            return true;
        }
        int temp[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[i]=nums[(ind+i)%nums.length];
        }
        for(int i=0;i<temp.length-1;i++){
            if(temp[i]>temp[i+1]){
                return false;
            }
        }
        return true;
    }
}