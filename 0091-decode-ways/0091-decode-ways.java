class Solution {
    int t[];
    public int numDecodings(String s) {
        t=new int[s.length()+1];
        Arrays.fill(t,-1);
        return solve(0,s);
    }
    int solve(int i,String s){
        if(i==s.length()){
            return 1;
        }
        if(t[i]!=-1)
        {
            return t[i];
        }
        if(s.charAt(i)=='0'){
            return 0;
        }
        int one=solve(i+1,s);
        int two=0;
        if(i+1<s.length()){
        if(s.charAt(i)== '1'||(s.charAt(i)=='2'&&s.charAt(i+1)<'7')){
            two=solve(i+2,s);
        }
        }
        return t[i]=one+two;
    }
}