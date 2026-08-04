class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> h=new HashSet<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            h.add(i);
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!h.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}