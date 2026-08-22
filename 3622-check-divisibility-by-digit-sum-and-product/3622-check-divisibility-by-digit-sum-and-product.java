class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int mul=1;
        int num=n;
        while(n>0){
            int d=n%10;
            sum+=d;
            mul*=d;
            n/=10;
        }
        // System.out.println(sum+" "+mul);
        // System.out.println((n%(mul+sum)));
        return (num%(mul+sum))==0;
    }
    
}