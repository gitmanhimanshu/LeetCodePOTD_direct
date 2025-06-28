class Solution {
    String ans = "";
String str = "";
    public String longestSubsequenceRepeatedK(String s, int k) {
        int num[] = new int[26];
str =s;

        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i) - 'a']++;
        }
        int maxLen = s.length() / k;
        int req[] = new int[26];

        for (int i = 0; i < req.length; i++) {
            if (num[i] >= k) {
                req[i] = 1;
            }
        }
                for(int i=0;i<num.length;i++){
            num[i]=num[i]/k;
        }
        solve(num, req, new StringBuilder(), k, maxLen);
        return ans;
    }

    void solve(int num[], int[] req, StringBuilder sb, int k, int maxLen) {
        if (sb.length() > maxLen) {
            return;
        }
        if (sb.length() > ans.length() || (sb.length() == ans.length() && sb.toString().compareTo(ans) > 0)) {
            if (isSub(str, sb.toString(), k)) {
                ans = sb.toString();
            }
        }

        for (int i = 0; i < num.length; i++) {
            if (req[i] == 1 && num[i] > 0) {
                num[i]--;
                sb.append((char) (i + 'a'));
                solve(num, req, sb, k, maxLen);
                num[i]++;
                sb.setLength(sb.length() - 1);
            }
        }
    }

    boolean isSub(String s1, String s2, int k) {
        int i = 0;
        int j = 0;
        while (i < s1.length() && j < k * s2.length()) {
            if (s1.charAt(i) == (s2.charAt(j % s2.length()))) {
                j++;
            }
            i++;
        }
        return j == k * s2.length();
    }
}