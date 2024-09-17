class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String ,Integer> him1=new HashMap<>();
        List<String> ans=new ArrayList<>();
           Map<String ,Integer> him2=new HashMap<>();
        for(String i:s1.split(" ")){
  him1.put(i,him1.getOrDefault(i,0)+1);
        }
         for(String i:s2.split(" ")){
  him2.put(i,him2.getOrDefault(i,0)+1);
        }
        for(String i:him1.keySet()){
            if(him1.get(i)==1){
                if(!him2.containsKey(i)){
                    ans.add(i);
                }
            }
        }
        for(String i:him2.keySet()){
            if(him2.get(i)==1){
                if(!him1.containsKey(i)){
                    ans.add(i);
                }
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}