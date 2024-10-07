class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int a[]=new int[triangle.get(triangle.size()-1).size()];
        for(int i=0;i<triangle.get(triangle.size()-1).size();i++){
            a[i]=triangle.get(triangle.size()-1).get(i);
        }

        int n=triangle.size();
        for(int i=n-2;i>=0;i--){
            int c[]=new int[triangle.get(i).size()];
            for(int j=0;j<c.length;j++){
                int d=triangle.get(i).get(j)+a[j];
                int dg=triangle.get(i).get(j)+a[j+1];
                c[j]=Math.min(d,dg);
            }
            a=c;
        }
        return a[0];
    }
}