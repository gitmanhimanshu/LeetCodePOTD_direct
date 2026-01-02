class Solution {
    public int findTheWinner(int n, int k) {
      ArrayList<Integer> h=new ArrayList<>();
      for(int i=0;i<n;i++){
        h.add(i+1);
      }
      int i=0;
      while(h.size()>1){
            i=(i+k-1)%h.size();
            h.remove(i);
      }
      return h.get(0);
    }
}