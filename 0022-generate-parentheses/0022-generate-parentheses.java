class Solution {
    public List<String> generateParenthesis(int n) {
   List<String> ans=new ArrayList<>();
    solve(ans,n,0,0,new StringBuilder());
    return ans;
    }
    void solve(List<String> ans,int n,int o,int c,StringBuilder sb){
        if(sb.length()==n*2){
            ans.add(sb.toString());
            return;
        }
        if(o<n){
            sb.append('(');
            solve(ans,n,o+1,c,sb);
            sb.setLength(sb.length()-1);
        }
        if(c<o){
          sb.append(')');
            solve(ans,n,o,c+1,sb);
            sb.setLength(sb.length()-1);  
        }
    }
}