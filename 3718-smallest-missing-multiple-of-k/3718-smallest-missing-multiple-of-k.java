class Solution {
    public int missingMultiple(int[] nums, int k) {
      Set<Integer> him=new HashSet<>();
      for(int i :nums){
        him.add(i);
      } 
      int i=1;
      int n=k;
    //   System.out.println(n);
    //     System.out.println(him.contains(n));
      while(him.contains(n)){
        n=k*i;
        i++;
      }
      return n;
    }
}