class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
       Set<Integer> him=new HashSet<>();
        for(int i:nums){
            him.add(i);
        }
        for(int i=1;i<=nums.length;i++){
            if(!him.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}