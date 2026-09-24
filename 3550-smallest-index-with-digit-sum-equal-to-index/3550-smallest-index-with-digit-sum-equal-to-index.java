class Solution {
    int sum(int n){
        int c=0;
        while(n>0){
            c+=(n%10);
            n=n/10;
        }
        return c;
    }
    public int smallestIndex(int[] nums) {
        int ind=0;
        for(int i:nums){
            if(sum(i)==ind){
                return ind;
            }
            ind++;
        }
        return -1;
    }
}