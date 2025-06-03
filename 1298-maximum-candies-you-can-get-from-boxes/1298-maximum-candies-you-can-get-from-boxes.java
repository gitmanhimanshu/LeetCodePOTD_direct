class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        Queue<Integer> him=new LinkedList<>();
        Set<Integer>vis=new HashSet<>();
        Set<Integer> found=new HashSet<>();
        for(int i:initialBoxes){
            if(status[i]!=0){
                him.add(i);
            }else{
                found.add(i);
            }
        }

        int c=0;
        while(!him.isEmpty()){
            int i=him.poll();
          if(vis.contains(i)){
                continue;
          }  
          vis.add(i);
        
          c+=candies[i];
          for(int k:containedBoxes[i]){
                if(status[k]==0){
                    found.add(k);
                }else{
                    him.add(k);
                }
          }
          for(int k:keys[i]){
            status[k]=1;
            if(found.contains(k)){
                him.add(k);
            }
          }

        }
        return c;
    }
}


// class Solution {
//     Set<Integer> vis;
//     Set <Integer> found;
//     public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
//         int c = 0;
//         vis=new HashSet<>();
//         found=new HashSet<>();
//         for (int i : initialBoxes) {
//             c+=dfs(status,candies,keys,containedBoxes,i);
//         }
//         return c;
//     }
//     int dfs(int []status,int []candies,int[][] keys,int[][] containedBoxes,int i){
//         if(vis.contains(i)){
//             return 0;
//         }
//         if(status[i]==0){
//             found.add(i);
//             return 0;
//         }
//         vis.add(i);
//         int c=candies[i];

//         for(int inside:containedBoxes[i]){
//             c+=dfs(status,candies,keys,containedBoxes,inside);
//         }
//         for(int key:keys[i]){
//              status[key]=1;
//              if(found.contains(key)){
//                 c+=dfs(status,candies,keys,containedBoxes,key); 
//              }
//         }
//         return c;
//     }
// }