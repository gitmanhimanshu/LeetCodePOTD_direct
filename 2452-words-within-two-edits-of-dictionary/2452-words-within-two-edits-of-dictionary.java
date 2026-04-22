class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans=new ArrayList<>();
        for (String s:queries){
            for(String j:dictionary){
                int diff=0;
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)!=j.charAt(i)){
                        diff++;
                    }
                }
                if(diff<=2){
                    ans.add(s);
                    break;
                }
            }
        }
        return ans;
        
    }
}