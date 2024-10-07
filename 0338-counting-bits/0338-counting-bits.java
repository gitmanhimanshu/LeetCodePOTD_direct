class Solution {
    int countOnes(int n) {
   int c=0;
   while(n!=0){
    int b=(n&1);
    if(b==1){
        c++;
    }
    n=n>>1;
   }
   return c;
}

    public int[] countBits(int n) {
        int ans[]=new int[n+1];
 for(int i=0;i<=n;i++){
    ans[i]=countOnes(i);
 }
 return ans;
    }
}