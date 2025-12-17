class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character>him=new HashMap<>();
        Map<Character,Character>him2=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(him.containsKey(s.charAt(i))){
                char l=him.get(s.charAt(i));
                    if(l!=t.charAt(i)){
                        return false;
                    }
                
            }else{
                 him.put(s.charAt(i),t.charAt(i));
            }
            
             if(him2.containsKey(t.charAt(i))){
                char l=him2.get(t.charAt(i));
                    if(l!=s.charAt(i)){
                        return false;
                    }
                
            }
            else{
               
                him2.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }
}