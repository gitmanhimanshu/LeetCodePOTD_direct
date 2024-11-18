class Solution {
    public int[] decrypt(int[] code, int k) {
      
   
      int ans[]=new int[code.length];
      for(int i=0;i<ans.length;i++){
        if(k>0){
            int l=0;
            int j=i+1;
            int sum=0;
            while(l< Math.abs(k)){
                if(j==code.length){
                    j=0;
                }
                sum+=code[j];
                j++;
                l++;
            }
            ans[i]=sum;

        }else if(k<0){
            int l=0;
            int j=i-1;
            int sum=0;
            while(l< Math.abs(k)){
                if(j==-1){
                    j=code.length-1;
                }
                sum+=code[j];
               // System.out.println(sum);
                j--;
                l++;
            }
           ans[i]=sum;

        }else if(k==0){
            ans[i]=0;
        }
      }
      return ans;
    }
}