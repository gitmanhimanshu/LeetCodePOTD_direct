class Solution {
    public int minJumps(int[] arr) {
        Map<Integer,List<Integer>> him=new HashMap<>();
        int step=0;
        for(int i=0;i<arr.length;i++){
            if(!him.containsKey(arr[i])){
                him.put(arr[i],new ArrayList<>());
            }
            him.get(arr[i]).add(i);
        }
        int vis[]=new int[arr.length];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        vis[0]=1;
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=1;i<=n;i++){
                int ele=q.poll();
                if(ele==arr.length-1){
                    return step;
                }
                int peeche=ele-1;
                int aage=ele+1;
                if(peeche>=0 &&vis[peeche]==0){
                    vis[peeche]=1;
                    q.add(peeche);
                }
                if(aage>=0 &&vis[aage]==0){
                    vis[aage]=1;
                    q.add(aage);
                }
                for(Integer k:him.get(arr[ele])){
                    if(vis[k]==0){
                    vis[k]=1;
                    q.add(k); 
                    }
                }
            }
            step++;
        }
        return -1;
    }
}