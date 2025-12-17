class Solution {
    public String removeOuterParentheses(String s) {
        int c=0;
        StringBuilder sb=new StringBuilder();
        for(char t:s.toCharArray()){
            if(t=='('){
                if(c>0){
                    sb.append(t);
                }
                c++;
            }else{
                if(c>1){
                    sb.append(t);
                }
                c--;
            }
        }
        return sb.toString();
    }
}