class p implements Comparable<p>{
char c;
int n;
p(char c,int n){
    this.c=c;
    this.n=n;
}
public int compareTo(p that){
    return that.c-this.c;
}


}
class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
      Map<Character,Integer> him=new HashMap<>();
      for(char i:s.toCharArray()){
        him.put(i,him.getOrDefault(i,0)+1);
      }  
      PriorityQueue<p> h=new PriorityQueue<>();
      for(Character i:him.keySet()){
          h.add(new p(i,him.get(i)));
      }
      StringBuilder sb=new StringBuilder();
      while(!h.isEmpty()){
            p k=h.poll();
            if(k.n<=repeatLimit){
               int l=k.n;
               while(l>0){
                sb.append(k.c);
                l--;
               }

            }else{
              int l=repeatLimit;
               while(l>0){
                sb.append(k.c);
                l--;
               }
             
               if(!h.isEmpty()){
                p t=h.poll();
                sb.append(t.c);
                if(t.n>1){
                    h.add(new p(t.c,t.n-1));
                }
               }else{
                break;
               }
               h.add(new p(k.c,k.n-repeatLimit));

            }
      }
      return sb.toString();
    }
}