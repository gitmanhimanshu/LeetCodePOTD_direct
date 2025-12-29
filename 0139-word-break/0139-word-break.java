class Solution {
    Boolean dp[];
    public boolean wordBreak(String s, List<String> wordDict) {
    Set<String> him=new HashSet<>();
    dp=new Boolean[s.length()+1];
    Arrays.fill(dp,null);
    for(String s1: wordDict){
        him.add(s1);
    }    
    return find(s,0,him);
    }
    boolean find(String s,int idx,Set<String> him){
        if(s.length()==idx){
            return true;
        }
        if(dp[idx]!=null){
            return dp[idx];
        }
        for(int i=idx+1;i<=s.length();i++){
            if(him.contains(s.substring(idx,i))&&find(s,i,him)){
                return dp[idx]= true;
            }
        }
        return dp[idx]=false;
    }
}