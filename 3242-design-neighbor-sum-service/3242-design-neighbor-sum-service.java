class NeighborSum {
    int a[][];

    public NeighborSum(int[][] grid) {
        a=grid;
    }
    
    public int adjacentSum(int value) {
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                int sum=0;
                if(a[i][j]==value){
                    if(i-1>=0)
                    {sum+=a[i-1][j];}
                    if(i+1<a.length)
                   { sum+=a[i+1][j];}
                    if(j-1>=0)
                    {sum+=a[i][j-1];}
                    if(j+1<a[0].length)
                    {sum+=a[i][j+1];}
                    return sum;
                }
            }
        }
        return 0;
    }
    
    public int diagonalSum(int value) {
          for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                int sum=0;
                if(a[i][j]==value){
                    if(i-1>=0&&j-1>=0)
                   { sum+=a[i-1][j-1];}
                    if(i+1<a.length&&j-1>=0)
               {     sum+=a[i+1][j-1];}
                    if(i-1>=0&&j+1<a[0].length)
                  {  sum+=a[i-1][j+1];}
                    if(i+1<a.length&&j+1<a[0].length)
                   { sum+=a[i+1][j+1];}
                    return sum;
                }
            }
        }
        return 0;
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */