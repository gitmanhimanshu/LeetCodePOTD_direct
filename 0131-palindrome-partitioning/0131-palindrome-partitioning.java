class Solution {
     List<List<String>>  ans;
    public List<List<String>> partition(String s) {
        ans=new ArrayList<>();
        solve(s,0,new ArrayList<>());

        return ans;
    }
    boolean same(String s,int se,int e){
        e=e;
        while(se<e){
            if(s.charAt(se)!=s.charAt(e)){
                return false;
            }
            se++;
            e--;
        }
        return true;
    }
    void solve(String s,int ind,List<String>him){
        if(ind>=s.length()){
            ans.add(new ArrayList<>(him));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(same(s,ind,i)){
                him.add(s.substring(ind,i+1));
                solve(s,i+1,him);
                him.remove(him.size()-1);

            }
        }
    }
}