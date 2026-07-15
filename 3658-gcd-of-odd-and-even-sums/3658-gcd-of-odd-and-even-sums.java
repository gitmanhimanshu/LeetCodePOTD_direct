class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evensum=findsum("even",n);
        int oddSum=findsum("odd",n);
        return gcd(evensum,oddSum);
    }
    int findsum(String type,int n){
        int c=0;
        int i=0;
        if(type.equals("even")){
            i=2;
        }else{
            i=1;
        }
        for(;i<=n*2;i+=2){
           c+=i; 
        }
        return c;
    }
    int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}