class Pair implements Comparable<Pair>{
    int key;
    int value;
    int stops;
    public Pair(int key,int value,int stops){
        this.key=key;
        this.value=value;
        this.stops=stops;
    }
    public int compareTo(Pair that){
        if(this.value==that.value){
            return this.stops-that.stops;
        }
        return this.value-that.value;
    }
    
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
        List<List<int []>> him=new ArrayList<>();
        for(int i=0;i<n;i++){
            him.add(new ArrayList<>());
        }
        for(int a[]:flights){
            him.get(a[0]).add(new int[]{a[1],a[2]});
        }
        PriorityQueue<Pair> h=new PriorityQueue<>();
        int des[][]=new int[n][k+2];
        for(int a[]:des)
            Arrays.fill(a,Integer.MAX_VALUE);

        h.add(new Pair(src,0,0));
        Arrays.fill(des[src],0);
        //des[src]=0;
        int c=0;
        while(!h.isEmpty()){
            Pair p=h.poll();
            // print(p,c);
            c++;
            // if(p.cal==){
            //     return 
            // }
            if(p.stops>k){
                continue;
            }
            
            
            int i=p.key;
            int value=p.value;
            List<int []> ele=him.get(i);
            for(int b[]:ele){
                int next_i=b[0];
                int next_value=b[1];
                int  flight=p.stops+1;
                if((value+next_value)<des[next_i][flight]){
                    des[next_i][flight]=value+next_value;
                    h.add(new Pair(next_i,des[next_i][flight],flight) );
                }
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i:des[dst]){
            ans=Math.min(i,ans);
        }
        return ans!=Integer.MAX_VALUE?ans:-1;
    }
    void print(Pair p,int c){
        System.out.println(p.key+" "+p.value+" "+p.stops+" "+c);
    }
}