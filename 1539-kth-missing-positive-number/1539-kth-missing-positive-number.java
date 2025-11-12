class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=1;
        for(int i=0;i<arr.length&&k>0;){
            if(arr[i]==n){
                i++;
            }else{
                k--;
            }
            n++;
        }
        while(k>0){
            k--;
            n++;
        }
        return n-1 ;
    }
}