import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
      PriorityQueue<BigInteger> him=new PriorityQueue<>();
        for(String i:nums){
           BigInteger i1=new BigInteger(i);
            if(him.size()<k){
                him.add(i1);
            }else{
                if(him.peek().compareTo(i1)<0){
                    him.poll();
                    him.add(i1);
                }
            }
        }
        return him.peek().toString();   
    }
}