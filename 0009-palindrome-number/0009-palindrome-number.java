class Solution {
    public boolean isPalindrome(int x) {
        int c=0,s=0;
        int n=x;
        int a=x;

        while(n>0){
            c=c+1;
            n/=10;
        }
while(a>0){
    int d=a%10;
    s=s*10+d;
    a=a/10;
}

return (s==x);
    }
}