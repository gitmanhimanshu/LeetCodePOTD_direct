class Solution {
    public int distinctSubseqII(String s) {
        int MOD_VALUE = 1_000_000_007;
        int uniqueCount = 0;
        int[] charContribution = new int[26];

        for (char currentChar : s.toCharArray()) {
            int charIndex = currentChar - 'a';

            int previousCount = uniqueCount;

            int freshSubsequences =
                    (previousCount + 1 - charContribution[charIndex] + MOD_VALUE)
                    % MOD_VALUE;

            uniqueCount = (uniqueCount + freshSubsequences) % MOD_VALUE;

            charContribution[charIndex] =
                    (charContribution[charIndex] + freshSubsequences) % MOD_VALUE;
        }

        return uniqueCount;
    }
}