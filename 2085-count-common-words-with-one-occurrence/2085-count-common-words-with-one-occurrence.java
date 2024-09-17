class Solution {
    public int countWords(String[] words1, String[] words2) {
         Map<String ,Integer> him1=new HashMap<>();
   //     List<String> ans=new ArrayList<>();
           Map<String ,Integer> him2=new HashMap<>();
        for(String i:words1){
  him1.put(i,him1.getOrDefault(i,0)+1);
        }
         for(String i:words2){
  him2.put(i,him2.getOrDefault(i,0)+1);
        }
        int ans=0;
        for(String i:him1.keySet()){
            if(him1.get(i)==1){
                if(him2.containsKey(i)){
                   if(him2.get(i)==1){
                    ans++;
                   }
                }
            }
        }
        // for(String i:him2.keySet()){
        //     if(him2.get(i)==1){
        //         if(him1.containsKey(i)){
        //             if(him1.get(i)==1)
        //            {ans++;}
        //         }
        //     }
        // }
        return ans;
    }
}