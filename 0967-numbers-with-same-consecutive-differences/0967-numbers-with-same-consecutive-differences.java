class Solution {
    List<Integer> him;
    public int[] numsSameConsecDiff(int n, int k) {
       him=new ArrayList<>();
        for(int i=9;i>=1;i--){
            solve(i,i,1,n,k);
        }
        int ans[]=new int[him.size()];
        int k1=0;
        for(Integer i:him){
            ans[k1++]=i;
        }
        return ans;
    }
    void solve(int curr,int lst,int len,int n,int k){
               if(len==n){
                him.add(curr);
                return;
               }
               int next1=lst+k;
               int next2=lst-k;
               if(next1<=9){
                solve(curr*10+next1,next1,len+1,n,k);
               }
                 if(next2>=0&&next1!=next2){
                solve(curr*10+next2,next2,len+1,n,k);
               }

    }
}