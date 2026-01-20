class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<=31;i++){
            int one=0;
            
            for(int num:nums){
                if((num>>i &1)==1){
                    one++;
                }
            }
            if(one%3!=0){
                ans |= (1 << i);
            }
        }
        return ans;
    }
}