class Solution {
    public String longestPalindrome(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int p=i-1;
            int r=i+1;
            int len=1;
            while(p>=0&&r<s.length()){
                if(s.charAt(p)==s.charAt(r)){
                    len+=2;
                    p--;
                    r++;
                }else{
                    break;
                }
            
            }
            if(res.length()<len){
                int st=i-len/2;
                res.setLength(0);
                res.append(s.substring(st,st+len));
               
            }
        }
          for(int i=0;i<s.length();i++){
            int p=i;
            int r=i+1;
            int len=0;
            while(p>=0&&r<s.length()){
                if(s.charAt(p)==s.charAt(r)){
                    len+=2;
                    p--;
                    r++;
                }else{
                    break;
                }
            
            }
            if(res.length()<len){
                int st=i+1-len/2;
                res.setLength(0);
                res.append(s.substring(st,st+len));
            }
        }
        return res.toString();
    }
}