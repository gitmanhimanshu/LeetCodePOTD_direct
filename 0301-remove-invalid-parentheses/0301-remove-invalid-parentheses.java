class Solution {
    Set<String> ans=new HashSet<>();

     Set<String> alreadykaamhogaya=new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        int k=find(s);
        solve(s,k);
        return new ArrayList<>(ans);
    }
    void solve(String s,int k){
        if(alreadykaamhogaya.contains(s)){
            return ;
        }else{
            alreadykaamhogaya.add(s);
        }
        if(k==0){
            int h=find(s);
            if(h==0){
                ans.add(s);

            }else{
                return ;
            }
        }
        for(int i=0;i<s.length();i++ ){
            String l=s.substring(0,i);
            String r=s.substring(i+1);
            solve(l+r,k-1);
        }
    }
    int find(String s){
        Stack<Character> him=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                him.push('(');
            }else if(s.charAt(i)==')'){
                if(!him.isEmpty()&&him.peek()=='('){
                    him.pop();
                }else{
                    him.push(')');
                }
            }
        }
        return him.size();
    }
}