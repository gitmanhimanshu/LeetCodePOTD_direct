class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int c=0;
        long sum=0;
        int min=Integer.MAX_VALUE;
        for(int a[]:matrix){
            for(int i:a){
                if(i<0){
                c++;
                }
                int val=Math.abs(i);
                sum+=val;
                min=Math.min(min,val);
            }
        }
        if(c%2==0){
            return sum;
        }
        return sum-2*min;
    }
}