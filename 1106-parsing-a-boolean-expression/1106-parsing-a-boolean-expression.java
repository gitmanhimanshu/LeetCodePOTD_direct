class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> him = new Stack<>();
        for (char i : expression.toCharArray()) {
            if (i == ',') {
                continue;
            } else if (i == ')') {
                    StringBuilder sb=new StringBuilder();
                    while(him.peek()!='('){
                        sb.append(him.pop());
                    }
                    him.pop();
                    him.push(find(sb.toString(),him.pop()));

            } else {
                him.push(i);
            }
        }
        return (him.peek()=='t')?true:false;

    }
    char find(String s,char op){
        if(op=='!'){
            return s.charAt(0)=='t'?'f':'t';
        }
       else if(op=='|'){
            for(char i:s.toCharArray()){
                if(i=='t'){
                    return 't';
                }
            }
            return 'f';
        }
    else if(op=='&'){
          for(char i:s.toCharArray()){
                if(i=='f'){
                    return 'f';
                }
            }
    }
    return 't';
    }
}