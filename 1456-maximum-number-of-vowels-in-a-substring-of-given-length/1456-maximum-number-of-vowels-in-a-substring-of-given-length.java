class Solution {
    boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
}
    public int maxVowels(String s, int k) {
        int i=0;
        int j=0;
        int ans=0;
        int curr=0;
        while(j<s.length()){
            char c=s.charAt(j);
            if(isVowel(c)){
                curr++;
            }
            if((j-i+1)==k){
                ans=Math.max(ans,curr);
                if(isVowel(s.charAt(i))){
                    curr--;
                    
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}