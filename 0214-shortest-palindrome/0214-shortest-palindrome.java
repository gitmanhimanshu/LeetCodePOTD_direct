class Solution {
    public String shortestPalindrome(String s) {
        if (s.length() == 0) {
            return s;
        }

        String rev = new StringBuilder(s).reverse().toString();

        for (int i = 0; i < s.length(); i++) {
            if (s.startsWith(rev.substring(i))) {
                return rev.substring(0, i) + s;
            }
        }

        return "";
    }
}
