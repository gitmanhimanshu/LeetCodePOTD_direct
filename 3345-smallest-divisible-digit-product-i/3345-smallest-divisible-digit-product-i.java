class Solution {
    public int smallestNumber(int n, int t) {
    while(solve(n)%t!=0){
        n=n+1;
    }  
    return n;
    }
    int solve(int n){
    
        int ans=1;
        while(n>0){
            ans=ans*(n%10);
            n=n/10;
            if(ans==0){
                return ans;
            }
        }
        return ans;
    }
}