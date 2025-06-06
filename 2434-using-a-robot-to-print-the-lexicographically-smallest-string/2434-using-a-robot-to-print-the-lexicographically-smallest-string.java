class Solution {
    public String robotWithString(String s) {
        char []prev=new char[s.length()];
        prev[prev.length-1]=s.charAt(s.length()-1);
        for(int i=prev.length-2;i>=0;i--){
            char c=s.charAt(i);
            if(c<prev[i+1]){
                prev[i]=c;
            }else{
                prev[i]=prev[i+1];
            }
        }
        StringBuilder ans=new StringBuilder();
        StringBuilder temp=new StringBuilder();

        for(int i=0;i<prev.length;i++){
            temp.append(s.charAt(i));
            while (temp.length() > 0 && (i == s.length() - 1 || temp.charAt(temp.length() - 1) <= prev[i + 1]))
{
                ans.append(temp.charAt(temp.length() - 1));
                temp.setLength(temp.length() - 1);
            }
        }
        while(temp.length()>0){
                ans.append(temp.charAt(temp.length() - 1));
                 temp.setLength(temp.length() - 1);
            }
            return ans.toString();
    }
}