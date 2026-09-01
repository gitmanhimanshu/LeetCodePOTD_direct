class Pair implements Comparable<Pair>{
    int i;
    int j;
    int effort;
    public Pair(int i,int j,int effort){
        this.i=i;
        this.j=j;
        this.effort=effort;
    }
    public int compareTo(Pair that){
        return this.effort-that.effort;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int min=Integer.MAX_VALUE;
        int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
        PriorityQueue<Pair> him=new PriorityQueue<>();
        if (heights.length == 1 && heights[0].length == 1) {
    return 0;
}
        int dis[][]=new int[heights.length][heights[0].length];
        dis[0][0]=0;
        for(int[] row : dis) {
    Arrays.fill(row, Integer.MAX_VALUE);
}
        him.add(new Pair(0,0,0));
        while(!him.isEmpty()){
            Pair p=him.poll();
            int i=p.i;
            int j=p.j;
            for(int a[]:dir){
                int next_i=i+a[0];
                int next_j=j+a[1];
                if(isValid(next_i,next_j,heights)){
                int edgeEffort =
                    Math.abs(heights[i][j] - heights[next_i][next_j]);
                
                int newEffort =
                Math.max(p.effort, edgeEffort);

                    if(newEffort < dis[next_i][next_j]) {
                        dis[next_i][next_j] = newEffort;

                        him.add(new Pair(next_i, next_j, newEffort));
                    }
            }
        }

        }
         return dis[heights.length - 1][heights[0].length - 1];
    }
        private boolean isValid(int i, int j, int[][] heights) {
        return i >= 0 &&
               i < heights.length &&
               j >= 0 &&
               j < heights[0].length;
    }
}