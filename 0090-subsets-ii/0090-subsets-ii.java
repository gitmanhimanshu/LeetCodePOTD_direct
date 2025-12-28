class Solution {
     Set<List<Integer> >him;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
         him=new HashSet<>();
        solve(nums,0,new ArrayList<>());
        return new ArrayList<>(him);
        }
        void solve(int []nums,int i,List<Integer> ans){
            if(i==nums.length){
                him.add(new ArrayList<>(ans));
                return;
            }
            ans.add(nums[i]);
            solve(nums,i+1,ans);
            ans.remove(ans.size()-1);
            solve(nums,i+1,ans);
        }
}