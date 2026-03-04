class Solution {
    public int numSpecial(int[][] mat) {
        int ans = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
            if (mat[i][j]==1){
                if (isSpecial(i, j, mat)) {
                    ans++;
                }
            }
            }
        }
        return ans;
    }

    boolean isSpecial(int r,int c,int mat[][]){
    for(int i=0;i<mat[0].length;i++){
            if(i==c){
            continue;
            }
            if(mat[r][i]==1){
            return false;
            }
            
            }
    for(int i=0;i<mat.length;i++){
            if(i==r){
            continue;
            }
            if(mat[i][c]==1){
            return false;
            }
            
            }
            return true;
    }

}