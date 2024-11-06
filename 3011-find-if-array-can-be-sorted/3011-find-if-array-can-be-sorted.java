class Solution {
    int find(int n){
        int c=0;
        while(n>0){
            if(n%2==1){
                c++;
            }
            n/=2;
        }
        return c;
    }
    public boolean canSortArray(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(find(nums[j])==find(nums[j+1])){
                    if(nums[j]>nums[j+1]){
                        int t=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=t;
                    }
                }
            }
        }
     //  System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
}