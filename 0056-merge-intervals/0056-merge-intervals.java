class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
                return a[0]-b[0];
        });


        List<int []> him=new ArrayList<>();
        if(intervals.length<=1){
            return intervals;
        }
        him.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int curr[]=intervals[i];
            if(him.get(him.size()-1)[1]>=curr[0]){
                him.get(him.size()-1)[1]=Math.max(him.get(him.size()-1)[1],curr[1]);
            }else{
                him.add(curr);
            }
        }
        return him.toArray(new int[him.size()][]);
    }
}