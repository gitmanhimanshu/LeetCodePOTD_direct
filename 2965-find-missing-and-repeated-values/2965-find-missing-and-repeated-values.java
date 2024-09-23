class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int total=grid.length*grid[0].length;
        Map<Integer,Integer> him=new HashMap<>();
        for(int [] i:grid){
          for(int j:i){
            him.put(j,him.getOrDefault(j,0)+1);
          }
        }
        int d=-1;
        int m=-1;
        for(int i=1;i<=total;i++){
       if(him.containsKey(i)){
        if(him.get(i)==2){
            d=i;
        }
       }else{
        m=i;
       }
        }
        return new int[]{d,m};
    }
}