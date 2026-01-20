class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> him=new Stack<>();
        for(char i:num.toCharArray()){
            while(!him.isEmpty()&&him.peek()>i&&k>0){
                him.pop();
                k--;
            }
            him.push(i);

        }
        while(k>0&&!him.isEmpty()){
            him.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!him.isEmpty()){
            sb.append(him.pop());
        }
        while(sb.length()>0&&sb.charAt(sb.length()-1)=='0'){
            sb.setLength(sb.length()-1);
    
        }
        if(sb.length()==0){
            return "0";
        }
        return sb.reverse().toString();
    }
}