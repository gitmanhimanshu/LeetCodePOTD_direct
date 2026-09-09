class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long power = 1000;   // first number that needs a comma

        while (power <= n) {
            ans += n - power + 1;
            
            // move to next comma level
            power *= 1000;
        }

        return ans;
    }
}