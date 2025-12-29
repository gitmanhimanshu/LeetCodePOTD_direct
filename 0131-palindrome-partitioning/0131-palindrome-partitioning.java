class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        bc(s,0, new ArrayList<>(),ans);
        return ans;
    }
    boolean aage_aur_peeche_same(String s,int st,int e){
        while(st<e){
            if(s.charAt(st)!=s.charAt(e)){
                return false;
            }
            st++;e--;
        }
        return true;
    }
    void bc(String s,int ind,List<String> him,List<List<String>> ans){
        if(ind==s.length()){
            ans.add(new ArrayList<>(him));
        }
        for(int i=ind;i<s.length();i++){
            if(aage_aur_peeche_same(s,ind,i)){
                him.add(s.substring(ind,i+1));
                bc(s,i+1,him,ans);
                him.remove(him.size()-1);
            }
        }
    }
}