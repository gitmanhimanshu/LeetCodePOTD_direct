class Solution {
    String dp[];
    public char findKthBit(int n, int k) {
        dp=new String[n+1];
        Arrays.fill(dp,"");
        String s=find(n);
        //System.out.println(s);
for(int i=0;i<s.length();i++){
    if(i+1==k){
        return s.charAt(i);
  
    }
       
}
   return ' ';
    }
    String find(int n){
        if(n==1){
            return "0";
        }
        if(dp[n]!=""){
            return dp[n];
        }
        String s=find(n-1);
        return dp[n]=s+"1"+invert(s);
 
    }
    String invert(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                sb.append('1');
            }else{
                sb.append('0');
            }
        }
        return sb.reverse().toString();
    }
}