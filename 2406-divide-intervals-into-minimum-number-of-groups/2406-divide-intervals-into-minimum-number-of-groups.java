class Solution {
    public int minGroups(int[][] intervals) {
        PriorityQueue<Integer> him=new PriorityQueue<>();
        Arrays.sort(intervals,(a,b)->{
            return a[0]-b[0];
        });
        for(int i[]:intervals){
            int s=i[0];
            int e=i[1];
            if(!him.isEmpty()&&him.peek()<s){
                him.poll();
            }
            him.add(e);
        }
        return him.size();
    }
}