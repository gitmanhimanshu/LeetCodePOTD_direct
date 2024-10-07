class Solution {
    public int minLength(String s) {
        Stack<Character> him=new Stack<>();
        for(char c:s.toCharArray()){
if(c=='B'){
    if(!him.isEmpty()&&him.peek()=='A'){
        him.pop();
    }else{
        him.push(c);
    }
}
else if(c=='D'){
    if(!him.isEmpty()&&him.peek()=='C'){
        him.pop();
    }else{
        him.push(c);
    }
}else{
    him.push(c);
}
        }
        return him.size();
    }
}