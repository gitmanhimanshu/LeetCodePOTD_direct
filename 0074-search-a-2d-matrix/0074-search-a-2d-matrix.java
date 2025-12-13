class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s=0;
        int e=matrix.length*matrix[0].length-1;
        int r=matrix[0].length;
        while(s<=e){
            int mid=(s+e)/2;
            if(matrix[mid/r][mid%r]==target){
                return true;
            }
            if(matrix[mid/r][mid%r]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return false;
    }
}