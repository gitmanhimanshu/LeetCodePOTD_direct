// class Solution {
//     public long pickGifts(int[] gifts, int k) {

//         while (k>0){        
//             int max=Integer.MIN_VALUE;
//             int ind=-1;
//             for(int i=0;i<gifts.length;i++){
//             if(gifts[i]>max){
//                 max=gifts[i];
//                 ind=i;
//             }}
//             k--;
//             gifts[ind]=(int)Math.sqrt(gifts[ind]);
  
//         }
//         long ans=0;
//         for(int i:gifts)
//             ans+=i;
//         return ans;
//     }
// }
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
    public long pickGifts(int[] gifts, int k) {
          PriorityQueue<p> him = new PriorityQueue<>();
        for (int i = 0; i < gifts.length; i++) {
            him.add(new p(i, gifts[i]));
        }
        while (k > 0) {
             if(!him.isEmpty()){
                p n=him.poll();
                int e=(int)  Math.sqrt(n.wt);
               
               gifts[n.i]= e;
                // System.out.println(Arrays.toString(gifts));
                him.add(new p(n.i,gifts[n.i]));
             }
             k--;
        }
        long ans=0;
        for(int i:gifts){
            ans+=i;
        }
        return ans;
    }
}