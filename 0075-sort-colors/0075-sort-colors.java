class Solution {
    public void sortColors(int[] nums) {
        PriorityQueue<Integer> him=new PriorityQueue<>();
        for(Integer i: nums){
            him.add(i);
        }
        int i=0;
        while(!him.isEmpty()){
            nums[i++]=him.poll();
        }
    }
}