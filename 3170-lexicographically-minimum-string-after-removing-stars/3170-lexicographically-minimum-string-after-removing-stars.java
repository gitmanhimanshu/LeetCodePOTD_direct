class Pair implements Comparable<Pair>{
    char v;
    int ind;
    Pair(char v,int ind){
        this.v=v;
        this.ind=ind;
    }
    public int compareTo(Pair that){
        if(this.v==that.v){
            return that.ind-this.ind;
        }
        return this.v-that.v;
    }
}
class Solution {
    public String clearStars(String s) {
        Set<Integer> remove=new HashSet<>();
        PriorityQueue<Pair> him=new PriorityQueue<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='*'){
                if(!him.isEmpty()){
                    Pair t=him.poll();
                    remove.add(t.ind);
                }
            }else{
                him.add(new Pair(c,i));
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!remove.contains(i)&&s.charAt(i)!='*'){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}