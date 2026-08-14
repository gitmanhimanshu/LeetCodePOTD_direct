class Solution {
    public int maximumLengthSubstring(String s) {
        int i=0;
        int j=0;
        int ans=1;
        int a[]=new int[26];
        while(j<s.length()){
            a[s.charAt(j)-'a']++;
            while(i<j&&a[s.charAt(j)-'a']>2){
                a[s.charAt(i)-'a']--;
                i++;
            }
            j++;
            ans=Math.max(ans,j-i);
        }
        return ans;
    }
}