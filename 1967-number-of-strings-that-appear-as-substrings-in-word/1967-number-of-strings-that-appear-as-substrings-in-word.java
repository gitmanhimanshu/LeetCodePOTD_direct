class Solution {
    boolean isSubString(String s,String word){
        for(int i=0;i<=word.length()-s.length();i++){
            if(s.equals(word.substring(i,i+s.length()))){
                return true;
            }
        }
        return false;
    }
    public int numOfStrings(String[] patterns, String word) {
        int ans=0;
        for(String s:patterns){
            if(isSubString(s,word)){
                ans++;
            }
        }
        return ans;
    }
}