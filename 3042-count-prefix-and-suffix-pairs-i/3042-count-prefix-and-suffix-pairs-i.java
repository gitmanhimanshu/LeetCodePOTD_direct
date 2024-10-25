class Solution {
    boolean solve(String s1,String s2){
        int n=s1.length();
        if(s2.length()<s1.length()){
            return false;
        }
        String preff=s2.substring(0,n);
        int l=s2.length()-n;
        String suff=s2.substring(l,s2.length());
        return s1.equals(preff)&&s1.equals(suff);

    }
    public int countPrefixSuffixPairs(String[] words) {
        
        int ans = 0;
        
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if(solve(words[i],words[j])){
                    ans++;
                }
                
              
            }
        }
        
        return ans;
    }
}
