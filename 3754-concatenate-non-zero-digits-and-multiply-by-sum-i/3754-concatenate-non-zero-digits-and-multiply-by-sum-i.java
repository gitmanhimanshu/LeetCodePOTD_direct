class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long num = 0;
        long place = 1;

        while (n > 0) {
            int d = n % 10;
            if (d != 0) {
                sum += d;
                num += (long) d * place;
                place *= 10;
            }
            n /= 10;
        }

        return sum * num;
    }
}