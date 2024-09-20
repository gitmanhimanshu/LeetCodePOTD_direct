class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i=1;i<s.length();i++){
          String p=s.substring(0,i);
          StringBuilder h=new StringBuilder();
          if(s.length()%i==0){
            for(int j=1;j<=s.length()/i;j++){
                h.append(p);
            }
          
            if(s.equals(h.toString())){
               //   System.out.println(h);
                return true;
            }
          }
        }
        return false;
    }
}