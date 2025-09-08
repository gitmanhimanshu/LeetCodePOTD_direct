class Solution {
    boolean isZero(int n){
        while(n>0){
            int c=n%10;
            if(c==0){
                return true;
            }
            n/=10;
        }
        return false;
    }
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
                int b=n-i;
            if(!isZero(i)&&!isZero(b)){
                return new int[]{i,b};
                
            }
        }
        return new int[0];
    }
}