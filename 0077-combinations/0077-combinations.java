class Solution {
    public List<List<Integer>> combine(int n, int k) {
         List<List<Integer>> him =new ArrayList<>();
        find(1, n, k, him, new ArrayList<>());
        return him;
    }
     void find(int ind,int n,int k, List<List<Integer>> him,List<Integer> ans){
        if(ans.size()==k){
            him.add(new ArrayList<>(ans));
            return;
        }
        for(int i=ind;i<=n;i++){
            ans.add(i);
            find(i+1, n,k, him, ans);
            ans.remove(ans.size()-1);
        }
    }
}