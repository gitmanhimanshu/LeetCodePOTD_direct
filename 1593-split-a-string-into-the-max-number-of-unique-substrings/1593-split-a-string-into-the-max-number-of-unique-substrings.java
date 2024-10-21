class Solution {
    public int maxUniqueSplit(String s) {
        Set<String> him=new HashSet<>();
  return solve(s,0,him);

    }
    int solve(String s,int ind, Set<String> him){
        if(ind==s.length()){
            return 0;
        }
        int t=0;
        for(int i=ind+1;i<=s.length();i++){
            String sb=s.substring(ind,i);
            if(!him.contains(sb)){
                him.add(sb);
             t=Math.max(t, 1+solve(s,i,him)) ;
                him.remove(sb);
            }

        }
    return t;
    }
}