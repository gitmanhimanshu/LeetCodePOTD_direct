class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        Map<Integer, List<Integer>> g = new HashMap<>();
        for (int i = 0; i < graph.length; i++) {
            g.put(i, new ArrayList<>());

        }
        int l = 0;
        for (int a[] : graph) {
            for (int i : a) {
                g.get(i).add(l);
            }
            l++;
        }
        int in[] = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            in[i]=graph[i].length;
        }
        Queue<Integer> him=new LinkedList<>();
        for(int i=0;i<in.length;i++){
            if(in[i]==0){
                him.add(i);
            }
        }
        List<Integer> ans=new ArrayList<>();
        while(!him.isEmpty()){
            int ele=him.poll();
            ans.add(ele);
            List<Integer> h=g.get(ele);
            for(int i:h){
                in[i]--;
                if(in[i]==0){
                    him.add(i);

                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}