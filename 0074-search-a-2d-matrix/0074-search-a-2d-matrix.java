class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int s=0,e=row*col-1;
         int mid=(s+e)/2;
        while(s<=e){
           
            if(matrix[mid/col][mid%col]==target){
                return true;
            }
            if(matrix[mid/col][mid%col]>target){
                e=mid-1;
            }
            if(matrix[mid/col][mid%col]<target){
                s=mid+1;
            }
                 mid=(s+e)/2;
        }
        return false;
    }
}