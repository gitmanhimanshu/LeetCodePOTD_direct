class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        List<Integer> him=new ArrayList<>();
        him.add(startTime[0]);
        for(int i=1;i<startTime.length;i++){
            him.add(startTime[i]-endTime[i-1]);
        }
        him.add(eventTime-endTime[endTime.length-1]);
        int ans=0;
        int temp=0;
        int i=0;
        int j=0;
        System.out.println(him);
        while(j<him.size()){
          while(j<him.size()&&j-i+1<=k+1){
            temp+=him.get(j);
            j++;
          }
          ans=Math.max(ans,temp);
          
          temp-=him.get(i);
          i++;
        }
        return ans;
    }
}