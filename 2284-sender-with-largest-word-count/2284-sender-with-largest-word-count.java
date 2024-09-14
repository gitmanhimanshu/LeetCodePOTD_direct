class pair implements Comparable<pair>{
   String i;
    int count;
       pair(String i,int c){
        this.i=i;
        this.count=c;
       }
       public int compareTo(pair th){
        if(th.count==this.count){
            return th.i.compareTo(this.i);
        }
        return th.count-this.count;
       }
}
class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String,Integer> him=new HashMap<>();
        for(int i=0;i<senders.length;i++){
            String s1=senders[i];
            String s=messages[i];
            int sp=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==' '){
                    sp++;
                }
            }
            sp++;
            him.put(s1,him.getOrDefault(s1,0)+sp);
        }
            PriorityQueue<pair> him1=new PriorityQueue<>();
            for(String i:him.keySet()){
           him1.add(new pair(i,him.get(i)));
            }
        if(him1.isEmpty()){
            return "";
        }
        return him1.poll().i;
    }
}