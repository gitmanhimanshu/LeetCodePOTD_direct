class Solution {
    public boolean sumGame(String num) {
        int n = num.length(), half = n / 2;
        long d = 0;          // sumLeft - sumRight
        int q1 = 0, q2 = 0;  // '?' counts in each half

        for (int i = 0; i < n; i++) {
            char c = num.charAt(i);
            if (i < half) {
                if (c == '?') q1++;
                else d += c - '0';
            } else {
                if (c == '?') q2++;
                else d -= c - '0';
            }
        }

        if (((q1 + q2) & 1) == 1) return true;           
        return 2 * d + 9L * (q1 - q2) != 0;                
    }
}