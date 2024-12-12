class p implements Comparable<p> {
    int i;
    int wt;

    p(int i, int wt) {
        this.i = i;
        this.wt = wt;
    }

    public int compareTo(p that) {
        return that.wt - this.wt;
    }
}

class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<p> him = new PriorityQueue<>();
        for (int i = 0; i < piles.length; i++) {
            him.add(new p(i, piles[i]));
        }
        while (k > 0) {
             if(!him.isEmpty()){
                p n=him.poll();
                int e=(int)  Math.floor(n.wt/2);
               
                piles[n.i]= piles[n.i]-e;
                 //System.out.println(Arrays.toString(piles));
                him.add(new p(n.i,piles[n.i]));
             }
             k--;
        }
        int ans=0;
        for(int i:piles){
            ans+=i;
        }
        return ans;
    }
}