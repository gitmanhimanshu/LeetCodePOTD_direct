class Solution {
    Set<List<Integer>>ans;
    public List<List<Integer>> combinationSum3(int k, int n) {
        ans=new HashSet<>();
        solve(k,n,new ArrayList<>(),0,1);
        return new ArrayList<>(ans);
    }
    void solve(int k,int n,List<Integer> him,int sum,int ind){
        if(him.size()==k){
            if(sum==n){
                ans.add(new ArrayList<>(him));
                
            }
            return;
        }
        if(sum>n){
            return;
        }
        for(int i=ind;i<=9;i++){
            if(sum+i<=n){
                him.add(i);
                solve(k,n,him,sum+i,i+1);
                him.remove(him.size()-1);
                solve(k,n,him,sum,i+1);
            }
            
        }
    }
}