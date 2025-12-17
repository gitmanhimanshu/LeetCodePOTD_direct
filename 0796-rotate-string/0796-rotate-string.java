class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
       StringBuilder him=new StringBuilder(s);
       for(int i=0;i<s.length();i++){
        if(him.toString().equals(goal)){
            return true;
        }
        char ch=him.charAt(0);
        him.deleteCharAt(0);

        him.append(ch);
       }
       return false;
    }
}