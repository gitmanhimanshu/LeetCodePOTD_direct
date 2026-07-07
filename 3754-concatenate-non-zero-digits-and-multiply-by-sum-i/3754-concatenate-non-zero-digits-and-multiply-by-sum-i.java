class Solution {
    public long sumAndMultiply(int n) {
        long sum=0L;
        long num=0L;
        String s=Integer.toString(n);
        for(char c:s.toCharArray()){
            if(c-'0'>0){
                sum+=(c-'0');
                num=(num*10+(c-'0'));
            }
        }
        return num*sum;
    }
}