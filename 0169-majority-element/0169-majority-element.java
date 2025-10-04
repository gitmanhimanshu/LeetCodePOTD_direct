class Solution {
    public int majorityElement(int[] nums) {
    int ans=-1;
    int c=0;
    for(int i:nums){
        if(c==0){
            ans=i;
            c=1;
        }else if(ans==i){
            c++;
        }else{
            c--;
        }
    }
    return ans;

    }
}