class Solution {
    
    // GCD helper to safely divide before multiplying, preventing overflow
    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private long nCr(int n, int r, long k) {
        if (r < 0 || r > n) return 0;
        r = Math.min(r, n - r);
        long res = 1;

        for (int i = 1; i <= r; i++) {
            long num = n - r + i;
            long den = i;
            
            // Simplify (res / den)
            long g1 = gcd(res, den);
            res /= g1;
            den /= g1;
            
            // Simplify (num / den)
            long g2 = gcd(num, den);
            num /= g2;
            den /= g2; // den becomes 1 here
            
            // Prevent multiplication overflow
            if (Long.MAX_VALUE / res < num) {
                return k;
            }
            
            res *= num;
            
            // Early exit if we have enough combinations
            if (res >= k) return k;
        }

        return res;
    }

    public String smallestPalindrome(String s, int k) {
        int n = s.length();
        long targetK = k; // Use long internally to prevent overflow
        
        int[] cnt = new int[26];
        for (int i = 0; i < n; i++) {
            cnt[s.charAt(i) - 'a']++;
        }

        int oddCount = 0;
        char mid = 0;
        
        // Find the middle character based on frequencies
        for (int i = 0; i < 26; i++) {
            if (cnt[i] % 2 == 1) {
                oddCount++;
                mid = (char) (i + 'a');
            }
            cnt[i] /= 2; // Keep count for exactly half the palindrome
        }

        // A valid palindrome can have at most one character with an odd frequency
        if (oddCount > 1) {
            return ""; 
        }

        StringBuilder half = new StringBuilder();
        int halfLen = n / 2;

        for (int pos = 0; pos < halfLen; pos++) {
            boolean placed = false;

            for (int ch = 0; ch < 26; ch++) {
                if (cnt[ch] == 0) continue;

                cnt[ch]--;

                int letters = 0;
                for (int x : cnt) letters += x;

                long ways = 1;
                for (int x : cnt) {
                    if (x > 0) {
                        long comb = nCr(letters, x, targetK);
                        
                        // Prevent overflow of combinations
                        if (targetK / ways < comb) {
                            ways = targetK;
                        } else {
                            ways *= comb;
                        }
                        
                        if (ways >= targetK) {
                            ways = targetK;
                            break;
                        }
                        
                        letters -= x;
                    }
                }

                if (ways >= targetK) {
                    half.append((char) (ch + 'a'));
                    placed = true;
                    break;
                }

                targetK -= ways;
                cnt[ch]++; // Backtrack
            }
            
            if (!placed) {
                return "";
            }
        }

        StringBuilder rev = new StringBuilder(half);
        rev.reverse();

        if (n % 2 == 1) {
            return half.toString() + mid + rev.toString();
        }

        return half.toString() + rev.toString();
    }
}