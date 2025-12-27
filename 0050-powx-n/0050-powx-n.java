class Solution {
    public double myPow(double x, int n) {
        int nn = n;
        if (n < 0) {
            nn = n * -1;
        }
        double ans = 1.0;
        while (nn >= 1) {
            if (nn % 2 == 0) {
                x = x * x;
                nn = nn / 2;
            } else {
                ans = ans * x;
                x = x * x;
                nn = nn / 2;
            }
        }
        if (n < 0) {
            return 1.0 / ans;
        }
        return ans;
    }
}