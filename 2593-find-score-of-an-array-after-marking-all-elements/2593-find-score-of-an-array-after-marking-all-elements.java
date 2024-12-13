class p implements Comparable<p> {
    int i;
    int wt;

    p(int i, int wt) {
        this.i = i;
        this.wt = wt;
    }

    public int compareTo(p that) {
        if(this.wt==that.wt){
            return this.i-that.i;
        }
        return this.wt - that.wt;
    }
}
class Solution {
    public long findScore(int[] nums) {
         PriorityQueue<p> him = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            him.add(new p(i, nums[i]));
        } 
        Set<Integer> h=new HashSet<>();
        long ans=0;
        while(!him.isEmpty()){
            if(h.contains(him.peek().i)){
                him.poll();
            }
            else{
                p l=him.poll();
                h.add(l.i);
                if(l.i-1>=0)
               { h.add(l.i-1);}
               if(l.i+1<nums.length)
             {   h.add(l.i+1);}
                ans+=l.wt;
            }
         //   System.out.println(h);
        }
        return ans;
    }
}