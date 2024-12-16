class p implements Comparable<p>{
int i;
int v;
   p(int i,int v){
    this.i=i;
    this.v=v;
   }
   public int compareTo(p that){
    if(this.v==that.v){
        return this.i-that.i;
    }
    return this.v-that.v;
   }
}
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<p> him=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            him.add(new p(i,nums[i]));
        }
        while(k>0){
            p h=him.poll();
            nums[h.i]=h.v*multiplier;
            him.add(new p(h.i,nums[h.i]));
            k--;
        }
        return nums;
    }
}