class Solution {
boolean isSubString(String s, String word) {

    for (int i = 0; i <= word.length() - s.length(); i++) {
        int j=0;
        while(j<s.length()&&s.charAt(j)==word.charAt(i+j)){
            j++;
        }
        if(j==s.length()){
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