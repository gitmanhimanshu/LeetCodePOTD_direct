class Solution {
    public int findMinDifference(List<String> timePoints) {
        int him[]=new int[timePoints.size()];
        int i=0;
        for(String s:timePoints){
         int h=Integer.parseInt(s.substring(0,2));
            int m=Integer.parseInt(s.substring(3,5));
                him[i++]=h*60+m;
        }
        Arrays.sort(him);
        int ans=Integer.MAX_VALUE;
        for(i=0;i<him.length-1;i++){
            ans=Math.min(ans,him[i+1]-him[i]);
        }
        return Math.min(ans,24*60-him[him.length-1]+him[0]);
    }
}