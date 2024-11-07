class Solution {
  // Map<String,Integer> him;
    public int largestCombination(int[] candidates) {
        // him=new HashMap<>();
        // return find(0,candidates,0,-1);
        int ans=0;
        for(int i=0;i<32;i++){
            int c=0;
            for(int k:candidates){
                if((k>>i&1)==1){
  c++;
                }
            }
            ans=Math.max(ans,c);
        }
        return ans;
    }
    // int find(int i,int []a,int total,int and){
    //     String key=i+","+total+","+and;
    //     if(i==a.length){
    //         return and>0?total:Integer.MIN_VALUE;
    //     }
    //     if(him.containsKey(key)){
    //         return him.get(key);
    //     }
    //     int in=find(i+1,a,total+1,and&a[i]);
    //     int ex=find(i+1,a,total,and);
    //      him.put(key,Math.max(in,ex)) ;
    //      return him.get(key);
    // }
}