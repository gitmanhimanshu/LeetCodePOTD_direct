class Solution {
    public int[] findErrorNums(int[] nums) {
        int c[]=new int[nums.length+1];
        for(int i:nums){
            c[i]++;
        }
        int p=-1,q=-1;
        for(int i=1;i<c.length;i++){
            if(c[i]==2){
                p=i;
            }else if(c[i]==0){
                        q=i;
            }
        }
        return new int[]{p,q};
    }
}