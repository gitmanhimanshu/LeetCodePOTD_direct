class Solution {
    public int singleNumber(int[] nums) {
    int ans=0;
    for(int i=0;i<=31;i++){
        int zero=0;
        int one=0;
        int t=1;
        for(int num:nums){
            if((t<<i&num)==0){
                zero++;
            }else{
                one++;
            }
        }
        if(one%3!=0){
            ans=ans|(t<<i);
        }
        
    }
    return ans;
    }
}