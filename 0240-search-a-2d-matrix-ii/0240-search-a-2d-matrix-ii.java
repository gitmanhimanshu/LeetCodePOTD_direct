class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int s=0,e=col-1;
        while(s<row&&e>=0){
            if(matrix[s][e]==target){
                return true;
            }
            if(matrix[s][e]<target){
                s++;
            }
             else{
                e--;
            }
            
        }
        return false;
    }
}