class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0){
            return 0;
        }
        
        int sign=1;
        int i=0;
        if(s.charAt(0)=='-'){
            sign=-1;
            i=1;
        }else if(s.charAt(0)=='+'){
            sign=1;
            i=1;
        }
        
    return (int)solve(s,i,sign,0L);

    }
    long solve(String s,int i,int sign,long n){
        if(i>=s.length()||!Character.isDigit(s.charAt(i))){
            return sign*n;
        }

        n=n*10+(s.charAt(i)-'0');
        if(n*sign>=Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(n*sign<=Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
     return    solve(s,i+1,sign,n);
        
    }
}