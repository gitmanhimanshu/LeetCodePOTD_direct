class Solution {
    public String reverseParentheses(String s) {
      Stack<String> him=new Stack<>();
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c==')'){
            while(!him.isEmpty() && !him.peek().equals("(")){
                sb.append(new StringBuilder(him.pop()).reverse());
            }

            him.pop();
            him.push(sb.toString());
            sb.setLength(0);
        }else{
            him.push(c+"");
        }
      }  
      sb.setLength(0);
      sb.append(him.pop());
     ;
      while(him.size()>0){
        sb.insert(0,him.pop());
      }
      return sb.toString();
    }
}