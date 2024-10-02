class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> him=new HashMap<>();
      
    for(char i:t.toCharArray()){
        him.put(i,him.getOrDefault(i,0)+1);
    }
      int st=-1;
        int i=0;
        int r=0;
        int c=0;
        int ml=Integer.MAX_VALUE;
        while(r<s.length()){
            if(him.containsKey(s.charAt(r))){
                if(him.get(s.charAt(r))>0){
                    c++;
                }
            }
             him.put(s.charAt(r),him.getOrDefault(s.charAt(r),0)-1); 
             while(c==t.length()){
                if((r-i+1)<ml){
                    st=i;
                    ml=r-i+1;
                }
                him.put(s.charAt(i),him.getOrDefault(s.charAt(i),0)+1); 
                if(him.get(s.charAt(i))>0){
                    c--;
                }
                i++;
               if(i>=s.length()){
                break;
               }
             }
             r++;
        }
        if(st==-1){
            return "";
        }
        return s.substring(st,st+ml);
    }
}