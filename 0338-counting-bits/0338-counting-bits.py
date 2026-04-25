class Solution:
    def countBits(self, n: int) -> List[int]:
        ans=[]
        for i in range(0,n+1):
            ans.append(self.count(i))
        return ans
    def count(self,n):
        c=0
        while(n>0):
            if(n&1!=0):
                c+=1
            n=n>>1
        return c