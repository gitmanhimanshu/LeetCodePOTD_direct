class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k){
            return false;
        }
        Map<Character,Integer> him=new HashMap<>();
        for(char i:s.toCharArray()){
            him.put(i,him.getOrDefault(i,0)+1);
        }
        int c=0;
        for(Integer i:him.values()){
            if(i%2!=0){
                c++;
            }
        }
        if(c>k){
            return false;
        }
        return true;
    }
}