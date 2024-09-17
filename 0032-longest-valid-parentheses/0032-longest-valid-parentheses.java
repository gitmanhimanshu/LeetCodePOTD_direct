class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> him=new Stack<>();
        List<Integer> him1=new ArrayList<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                him.push(i);
            }else if(s.charAt(i)==')'){
                if(!him.isEmpty()&&s.charAt(him.peek())=='('){
                    him.pop();
                }else{
                    him.add(i);
                }
            }
        }
       him1.add(0,s.length());
        while(!him.isEmpty()){
            him1.add(0,him.pop());
        }
        him1.add(0,-1);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<him1.size()-1;i++){
            max=max>(him1.get(i+1)-him1.get(i)-1)?max:(him1.get(i+1)-him1.get(i)-1);
        }
        return max;
    }
}