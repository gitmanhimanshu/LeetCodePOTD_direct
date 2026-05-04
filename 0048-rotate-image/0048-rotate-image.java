class Solution {
    public void rotate(int[][] matrix) {
     for(int i=0;i<matrix.length;i++){
        for(int j=i;j<matrix[0].length;j++){
            int c=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=c;
        }
     } 
       int m=matrix.length;
       int i=0,j=m-1;
       while(i<j){
        int k=0;
        while(k<m){
           int c= matrix[k][i];
           matrix[k][i]=matrix[k][j];
           matrix[k][j]=c;
           k++;
        }
        i++;
        j--;
       }
    }
}