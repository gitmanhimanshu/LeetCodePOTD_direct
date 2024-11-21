class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int c[][]=new int[m][n];
        for(int i[]:guards){
            c[i[0]][i[1]]=1;
        }
        for(int i[]:walls){
            c[i[0]][i[1]]=2;
        }
        int ans=0;
           for(int i[]:c){
          System.out.println(Arrays.toString(i));
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(c[i][j]==1){
                    for(int k=j+1;k<n&&c[i][k]!=2&&c[i][k]!=1;k++){
                        c[i][k]=3;
                    }
                    for(int k=i+1;k<m&&c[k][j]!=2&&c[k][j]!=1;k++){
                        c[k][j]=3;
                    }
                    for(int k=j-1;k>=0&&c[i][k]!=2&&c[i][k]!=1;k--){
                        c[i][k]=3;
                    }
                     for(int k=i-1;k>=0&&c[k][j]!=2&&c[k][j]!=1;k--){
                        c[k][j]=3;
                    }


                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(c[i][j]==0){
                    ans++;
                }
            }
        }
        return ans;
    }

}