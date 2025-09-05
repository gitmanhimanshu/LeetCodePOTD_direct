class Solution {
    public String longestPalindrome(String s) {
        String res="";
        if(s.length()==1){
            return s;
        }
        for(int i=0;i<s.length();i++){
            int p=i-1;
            int r=i+1;
            int len=1;
            while(p>=0&&r<s.length()){
                if(s.charAt(p)==s.charAt(r)){
                    len+=2;
                }else{
                    break;
                }
              
                p--;r++;
            }
              if(len>res.length()){
                    int st=i-len/2;
                    res=s.substring(st,st+len);
                }
        }
        for(int i=0;i<s.length()-1;i++){
            int p=i;
            int r=i+1;
            int len=0;
            while(p>=0&&r<s.length()){
                if(s.charAt(p)==s.charAt(r)){
                    len+=2;
                }else{
                    break;
                }
               
                p--;r++;
            }
             if(len>res.length()){
                    int st=i+1-len/2;
                    res=s.substring(st,st+len);
                }
        }
        return res;
    }
}