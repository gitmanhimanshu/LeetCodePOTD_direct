class Solution {
    public boolean isIsomorphic(String s, String t) {
      Map<Character,Character> him=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(him.containsKey(a)){
                if(!him.containsValue(b)){
                   return false;
                }
                else{
                char h=him.get(a);
                    if(b!=h){
                        return false;
                    }
                }
            }else{
                char j=t.charAt(i);
                if(him.containsValue(j)){
                    return false;
                }
                else{
                him.put(a,b);
                }
            }
        }
        return true;
    }
}