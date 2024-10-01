class Solution {
    public boolean isPerfectSquare(int num) {
        int d=(int)Math.sqrt(num);
        return d*d==num;
    }
}