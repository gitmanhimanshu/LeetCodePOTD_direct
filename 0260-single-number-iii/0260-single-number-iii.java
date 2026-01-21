class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        int lastset=xor&~(xor-1);
        int num1=0;
        int num2=0;
        for(int i:nums){
            if((lastset&i)!=0){
                num1=num1^i;
            }else{
                num2=num2^i;
            }
        }
        return new int[]{num1,num2};
    }
}