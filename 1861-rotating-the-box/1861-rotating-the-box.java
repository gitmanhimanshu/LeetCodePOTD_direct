class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        for(int i=0;i<boxGrid.length;i++){
            int empty=boxGrid[0].length-1;
            for(int j=boxGrid[0].length-1;j>=0;j--){
                if(boxGrid[i][j]=='*'){
                    empty=j-1;
                }else if(boxGrid[i][j]=='#'){
                    boxGrid[i][j]='.';
                    boxGrid[i][empty]='#';
                    empty--;
                }
            }
        }
        int m = boxGrid.length;
        int n = boxGrid[0].length;
       char[][] ans = new char[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                ans[j][m - 1 - i] = boxGrid[i][j];
            }
        }

        return ans;
        
    }

    }
