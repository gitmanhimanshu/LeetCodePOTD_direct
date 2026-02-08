class Solution {
    public int findDuplicate(int[] nums) {
    Set<Integer> him=new HashSet<>();
    for(int i=0;i<nums.length;i++){
    if(him.contains(nums[i])){
        return nums[i];
    }
    him.add(nums[i]);
    }
    return -1;
    }
}