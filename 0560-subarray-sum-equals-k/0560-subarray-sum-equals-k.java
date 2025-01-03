class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> him=new HashMap<>();
        him.put(0,1);
        int c=0;
        int sum=0;
        for(int i:nums){
            sum+=i;
            if(him.containsKey(sum-k)){
                c+=him.get(sum-k);
            }
            him.put(sum,him.getOrDefault(sum,0)+1);
        }
        return c;
    }
}