class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int ans=1;
        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0]){
                return b[1]-a[1];
            }
            return a[0]-b[0];
        });
        int c[]=intervals[0];
        
        // System.out.println(Arrays.toString(c));
        for(int i=1;i<intervals.length;i++){
            if(c[0]<=intervals[i][0]&&c[1]>=intervals[i][1]){
                continue;
            }
            c=intervals[i];
            ans++;
        }
        
        return ans;
        
    }
}