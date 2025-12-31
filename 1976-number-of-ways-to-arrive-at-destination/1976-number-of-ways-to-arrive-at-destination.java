class Solution {
    int mod = 1000000007;
    class Pair  implements Comparable<Pair>{
        int e;
        int wt;
        Pair(int e,int wt){
            this.e=e;
            this.wt=wt;
        }
        public int compareTo(Pair that){
            return this.wt-that.wt;
        }
    }
    public int countPaths(int n, int[][] roads) {
        List<List<List<Integer>>>him=new ArrayList<>();

        for(int i=0;i<n;i++){
            him.add(new ArrayList<>());
        }
        for(int a[]:roads){
            him.get(a[0]).add(new ArrayList<>(Arrays.asList(a[1],a[2])));
            him.get(a[1]).add(new ArrayList<>(Arrays.asList(a[0],a[2])));
        }
        int v[]=new int[n];
        int w[]=new int[n];
        long count[]=new long[n];
        Arrays.fill(w,Integer.MAX_VALUE);
        PriorityQueue<Pair> h=new PriorityQueue<>();
        count[0]=1L;
        w[0]=0;
        h.add(new Pair(0,0));
        while(!h.isEmpty()){
            Pair p=h.poll();
            if(p.wt>w[p.e]){
                continue;
            }
            if(v[p.e]==1){
                continue;
            }
            v[p.e]=1;
            w[p.e]=p.wt;
            for(List<Integer> k:him.get(p.e)){
                int twt=k.get(1)+w[p.e];
                int ele=k.get(0);
                if(w[ele]>twt&&v[ele]==0){
                    w[ele]=twt;
                    count[ele]=count[p.e]%mod;
                    h.add(new Pair(ele,twt));
                }else if(w[ele]==twt){
                    count[ele]=count[p.e]%mod+count[ele]%mod;
                }
            }
        }
        return (int)count[n-1]%mod;
        

    }
}