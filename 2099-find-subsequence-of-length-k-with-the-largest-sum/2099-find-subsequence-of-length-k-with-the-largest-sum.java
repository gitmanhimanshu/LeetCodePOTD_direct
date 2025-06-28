class Pair implements Comparable<Pair>{
    int ind;
    int ele;
    Pair(int ind,int ele){
        this.ind=ind;
        this.ele=ele;
    }
    public int compareTo(Pair that){
        return that.ele-this.ele;
    }
}
class Solution {

    public int[] maxSubsequence(int[] nums, int k) {
        int a[]=new int[k];
        PriorityQueue<Pair>him=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            him.add(new Pair(i,nums[i]));
        }
        
        List<Pair> topK = new ArrayList<>();
        while(!him.isEmpty()&&k>0){
  topK.add(him.poll());
     k--;
        }
        Collections.sort(topK,(ac,b)->ac.ind-b.ind);
for(int i=0;i<a.length;i++){
    a[i]=topK.get(i).ele;
}
      
        return a;
    }
}