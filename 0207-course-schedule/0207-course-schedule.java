class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>him=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            him.add(new ArrayList<>());
        }
        for(int a[]: prerequisites){
            him.get(a[1]).add(a[0]);
        }
        int in[]=new int [numCourses];
        for(int i=0;i<in.length;i++){
            for(Integer j:him.get(i)){
                in[j]++;
            }
        }
        Queue<Integer> h=new LinkedList<>();
        for(int i=0;i<in.length;i++){
         if(in[i]==0){
             h.add(i);
         }
        }
        int a=0;
        while(!h.isEmpty()){
            int c=h.poll();
            a++;
            for(Integer j: him.get(c)){
                in[j]--;
                if(in[j]==0){
                    h.add(j);
                }
            }
        }
        return a==in.length;
    }
}