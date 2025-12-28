class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> him=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        helper(him,nums,0,ans);
        return (him);
    }
    void helper(List<List<Integer>> him,int []nums,int ind,List<Integer> ans){
        if(ind==nums.length){
            
            him.add(new ArrayList<>(ans));
            return ;
        }
      
        
        ans.add(nums[ind]);
        helper(him,nums,ind+1,ans);
        ans.remove(ans.size()-1);
        while(ind<nums.length-1&&nums[ind]==nums[ind+1]){
            ind++;
        }
          helper(him,nums,ind+1,ans);
    }
}