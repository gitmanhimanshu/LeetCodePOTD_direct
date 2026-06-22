class Solution {
    public int maxNumberOfBalloons(String text) {
        int a[] = new int[26];
        for (char i : text.toCharArray()) {
            a[i - 'a']++;
        }
        int ans = Integer.MAX_VALUE;
        for (char i : "ballon".toCharArray()) {
            if (a[i - 'a'] == 0) {
                return 0;
            }
            if (i == 'l'||i=='o') {
                ans = Math.min(ans, a[i - 'a']/2);
                continue;
            }
            ans = Math.min(ans, a[i - 'a']);
        }
        return ans;
    }
}