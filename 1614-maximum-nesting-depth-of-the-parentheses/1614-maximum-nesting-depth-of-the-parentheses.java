class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int t=0;
        for (char c:s.toCharArray()){
            if(c=='('){
                t++;
            }
            if (c==')'){
                t--;
            }
            ans=Math.max(t,ans);
        }
        return ans;
    }
}