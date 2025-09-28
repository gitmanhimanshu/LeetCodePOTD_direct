class Solution {
    public void setZeroes(int[][] matrix) {
        int t[][]=new int[matrix.length][matrix[0].length];
      
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    t[i][j]=1;
                }
            }
        }
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
               if(t[i][j]==1){
                   set(matrix,i,j);
               }
           }
       }
    }
        void set(int [][]matrix,int k,int p){
            for(int i=0;i<matrix[0].length;i++){
                matrix[k][i]=0;
            }
            for(int j=0;j<matrix.length;j++){
                matrix[j][p]=0;
            }
        }
    
}