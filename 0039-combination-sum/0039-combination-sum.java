class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans=new ArrayList<>();
        solve(candidates,target,0,0,new ArrayList<>());
        return ans;
    }
    void  solve(int []arr,int k,int sum,int i,List<Integer> him){
        if(sum==k){
            ans.add(new ArrayList<>(him));
            return;
        }
        if(i>=arr.length){
            return ;
        }
        if(k-sum>=arr[i])
      {  him.add(arr[i]);
        solve(arr,k,sum+arr[i],i,him);
        him.remove(him.size()-1);}
        solve(arr,k,sum,i+1,him);
    }
}