class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> m=new HashSet<>(Arrays.asList(bannedWords));
        int c=0;
        for(String i:message){
            if(m.contains(i)){
                c++;
            }
            if(c>=2){
                return true;
            }
        }
        return false;
    }
}