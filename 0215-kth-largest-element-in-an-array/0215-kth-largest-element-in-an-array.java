class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> him=new PriorityQueue<>();
        for(int i:nums){
            if(him.size()<k){
                him.add(i);
            }else{
                if(him.peek()<i){
                    him.poll();
                    him.add(i);
                }
            }
        }
        return him.peek();
    }
}