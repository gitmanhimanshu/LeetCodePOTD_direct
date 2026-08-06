class Solution:
    def smallestNumber(self, n: int, t: int) -> int:
        # print(n)
        while((self.solve(n)%t )!=0):
            n=n+1
        return n
    def solve(self,n):
        ans=1
        while(n>0):
            ans=ans*(n%10)
            if(ans==0):
                return 0
            n=n//10
        print(ans)
        return ans