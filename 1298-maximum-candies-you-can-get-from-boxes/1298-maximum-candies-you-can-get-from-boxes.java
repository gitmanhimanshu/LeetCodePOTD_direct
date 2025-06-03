class Solution {
    Set<Integer> vis;
    Set <Integer> found;
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int c = 0;
        vis=new HashSet<>();
        found=new HashSet<>();
        for (int i : initialBoxes) {
            c+=dfs(status,candies,keys,containedBoxes,i);
        }
        return c;
    }
    int dfs(int []status,int []candies,int[][] keys,int[][] containedBoxes,int i){
        if(vis.contains(i)){
            return 0;
        }
        if(status[i]==0){
            found.add(i);
            return 0;
        }
        vis.add(i);
        int c=candies[i];

        for(int inside:containedBoxes[i]){
            c+=dfs(status,candies,keys,containedBoxes,inside);
        }
        for(int key:keys[i]){
             status[key]=1;
             if(found.contains(key)){
                c+=dfs(status,candies,keys,containedBoxes,key); 
             }
        }
        return c;
    }
}