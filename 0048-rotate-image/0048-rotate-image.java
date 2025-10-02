class Solution {
    public void rotate(int[][] matrix) {
        int i=0;
        int j=matrix[0].length-1;
        int ans[][]=new int[matrix.length][matrix[0].length];
        while(i<matrix.length&&j>=0){
            
            int r=0;
            while(r<matrix.length){
                ans[r][j]=matrix[i][r];
               
                r++;
            }
            i++;
            j--;

        }
        for(i=0;i<ans.length;i++){
            for(j=0;j<ans.length;j++){
                matrix[i][j]=ans[i][j];
            }
        }
        
    }
}