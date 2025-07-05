class Solution {
    public int findLucky(int[] arr) {
     Map<Integer,Integer> him=new HashMap<>();
     for(int i:arr){
        him.put(i,him.getOrDefault(i,0)+1);
     } 
     int ans=-1;  
     for (int i:him.keySet()){
        if(i==him.get(i)){
            ans=Math.max(ans,i);
        }
     }
     return ans;
    }
}