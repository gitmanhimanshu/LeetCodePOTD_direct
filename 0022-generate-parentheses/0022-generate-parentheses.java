class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>[]dp=new List[n+1];
        dp[0]=new ArrayList<>();
             dp[1]=new ArrayList<>();
        dp[0].add("");
        dp[1].add("()");
        for(int i=2;i<=n;i++){
                 dp[i]=new ArrayList<>();
            int inner=i-1;
            int outer=0;
            while(inner>=0&&outer<=i-1){
                for(String i1:dp[inner]){
                    for(String j:dp[outer]){
                        StringBuilder sb=new StringBuilder();
                        sb.append("(");
                         sb.append(i1);
                         sb.append(")");
                         sb.append(j);
                        dp[i].add(sb.toString());
                    }
                }
                inner--;
                outer++;
            }
        }
        return dp[n];
    }
}