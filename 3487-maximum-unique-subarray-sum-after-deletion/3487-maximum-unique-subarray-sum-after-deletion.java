class Solution {
    public int maxSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            max=Math.max(i,max);
        }
        if(max<0){
            return max;
        }
        max=0;
        Set<Integer> him=new HashSet<>();
        for(int i:nums){
            if(i>0&&!him.contains(i)){
                him.add(i);
                max+=i;
            }
        }
        return max;
    }
}