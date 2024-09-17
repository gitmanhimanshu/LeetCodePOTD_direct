class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> him=new Stack<>();
      //  List<Integer> him1=new ArrayList<>();
        him.push(-1);
     int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
               //  System.out.println(i);
                him.push(i);
            }else{
                him.pop();
                if(him.isEmpty()){
                    him.push(i);
                }
                ans=Math.max(ans,i-him.peek());
            }
            }
        

  
        return ans;
    }
}