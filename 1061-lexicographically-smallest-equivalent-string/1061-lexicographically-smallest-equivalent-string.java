class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        Map<Character, ArrayList<Character>> him = new HashMap<>();
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            if (him.containsKey(s1.charAt(i))) {
                him.get(s1.charAt(i)).add(s2.charAt(i));
            } else {
                him.put(s1.charAt(i), new ArrayList<>());
                him.get(s1.charAt(i)).add(s2.charAt(i));
            }
            if (him.containsKey(s2.charAt(i))) {
                him.get(s2.charAt(i)).add(s1.charAt(i));
            } else {
                him.put(s2.charAt(i), new ArrayList<>());
                him.get(s2.charAt(i)).add(s1.charAt(i));
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<baseStr.length();i++){
            char c=min(baseStr.charAt(i),him,new HashSet<>());
            ans.append(c);
        }
        return ans.toString();
    }
    char min(char i,Map<Character, ArrayList<Character>> him,Set<Character> vis){
         if(!him.containsKey(i)||vis.contains(i)){
            return i;
         }
         vis.add(i);
        char sm=i;
         for(char ch:him.get(i)){
            
           char  res=min(ch,him,vis);
            if(res<sm){
                sm=res;
            }
            
         }

 return sm;
    }
}