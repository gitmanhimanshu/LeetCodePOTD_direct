class Solution {
    Boolean dp[][];
    public boolean checkValidString(String s) {
        dp=new Boolean[s.length()+1][s.length()+1];
        return solve(s,0,0);
    }
    public boolean solve(String s,int a,int i){
        if(i==s.length()){
            return a==0;
        }
        if(a<0){
            return false;
        }
        if(dp[i][a]!=null){
            return dp[i][a];
        }
        boolean valid=false;
        if(s.charAt(i)=='('){
          valid=valid|| solve(s,a+1,i+1);
        }else if(s.charAt(i)==')'){
            valid=valid|| solve(s,a-1,i+1);
        }else{
            valid=valid||solve(s,a+1,i+1);
            valid=valid|| solve(s,a-1,i+1);
            valid=valid|| solve(s,a,i+1);
        }
        return dp[i][a]=valid;
    }
}