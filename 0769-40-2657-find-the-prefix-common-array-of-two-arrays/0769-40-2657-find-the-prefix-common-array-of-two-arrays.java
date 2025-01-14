class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
    int a[]=new int[50+1];
    int c=0;
    int ans[]=new int[A.length];
    for(int i=0;i<A.length;i++){
      a[A[i]]++;
      a[B[i]]++;
      if(a[A[i]]==2&&A[i]!=B[i]){
        c++;
      }
      if(a[B[i]]==2){
        c++;
      }

      ans[i]=c;
    }
    return ans;
    }
}