class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int ans[]=new int[seq.length()];
        int c=0;
        for(int i=0;i<seq.length();i++){
             
            if(seq.charAt(i)=='('){
                c++;
                ans[i]=c%2;
        }else{
        ans[i]=c%2;
        c--;
    }
   
        }
        return ans;
}
}