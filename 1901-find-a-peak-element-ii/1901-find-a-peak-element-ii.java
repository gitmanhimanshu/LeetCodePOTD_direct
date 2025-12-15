class Solution {
    int maxInd(int a[][],int c){
        int max=-1;
        int maxele=-1;
        for(int i=0;i<a.length;i++){
            if(a[i][c]>maxele){
                max=i;
                maxele=a[i][c];
            }
        }
        return max;
        
    }
    boolean isLeft(int a[][],int mid,int s,int r){
        int maxrow=maxInd(a,mid);
        if (mid==a[0].length-1){
            return true;
        }
        return a[maxrow][mid]>a[maxrow][mid+1];
    }
    public int[] findPeakGrid(int[][] mat) {
      int s=0;
      int r=mat[0].length-1;
      int ans=-1;
      while(s<=r){
        int mid=(s+r)/2;
        if(isLeft(mat,mid,s,r)){
            r=mid-1;
            ans=mid;
        }else{
            s=mid+1;
        }
      } 
    return new int[]{maxInd(mat,ans),ans};
    }
}