class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> him=new HashSet<>();
        for(int i :nums){
            him.add(i);
        }
        while(him.contains(original)){
            original=original*2;
        }
        return original;
    }
}