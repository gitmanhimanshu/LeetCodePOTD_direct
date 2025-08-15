class Solution {
    public boolean isPowerOfFour(int n) {
        if(n%2!=0&&n>1||n==6){
            return false;
        }
        while(n>1 && n%2==0){
            n/=4;

        }
        return n==1;
    }
}