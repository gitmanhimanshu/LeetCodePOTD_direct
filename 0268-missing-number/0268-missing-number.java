class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> him=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            him.add(nums[i]);
        }
        for(int i=0;i<=nums.length;i++){
            if(!him.contains(i)){
                return i;
            }
        }
        return -1;
    }
}