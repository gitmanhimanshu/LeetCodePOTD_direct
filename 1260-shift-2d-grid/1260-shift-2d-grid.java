class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int a[]=new int[n*m];
        int l=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[l++]=grid[i][j];
            }
        }
        k=k%(n*m);
        rev(a,0,(n*m)-1);
        rev(a,0,k-1);
        rev(a,k,(n*m)-1);
        l=0;
        List<List<Integer>> him=new ArrayList<>();
        for(int i=0;i<n;i++){
            him.add(new ArrayList<>());
            for(int j=0;j<m;j++){
                him.get(i).add(a[l]);
                l++;
            }
        }
        return him;

        
    }
    void rev(int a[],int i,int j){
        while(i<j){
            int c=a[i];
            a[i]=a[j];
            a[j]=c;
            i++;
            j--;
        }
    }
}