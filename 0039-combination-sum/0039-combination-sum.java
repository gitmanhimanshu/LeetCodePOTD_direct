class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> ans=new ArrayList<>();
        fun(0,target,ans,new ArrayList<>(),candidates);
        return ans;
    }
    void fun(int ind,int target, List<List<Integer>> ans,List<Integer> him,int a[]){
        if(ind==a.length){
            if(target==0){
                
                ans.add(new ArrayList<>(him));
               
            }
           return;
        }
            if(target>=a[ind]){
                him.add(a[ind]);
                fun(ind,target-a[ind],ans,him,a);
                him.remove(him.size()-1);
            }
            fun(ind+1,target,ans,him,a);
        }
    
}