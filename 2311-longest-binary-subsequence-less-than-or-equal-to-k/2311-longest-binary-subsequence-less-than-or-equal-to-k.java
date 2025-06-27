class Solution {
    public int longestSubsequence(String s, int k) {
        int ans = 0;
        int p = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i)=='0'){
                ans++;
                p++;
            }else {
                int val=(s.charAt(i)-'0') *(int)Math.pow(2,p);
                if(val<=k){
                    ans++;
                    k-=val;
                }
                p++;
            }
        }
        return ans;
    }
}