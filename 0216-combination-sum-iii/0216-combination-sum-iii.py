class Solution:
    def combinationSum3(self, k: int, n: int) -> List[List[int]]:
        self.a=[]
        self.solve(k,n,[],1)
        return self.a
    def solve(self,k,n,b,ind):
        if n==0 and k==0:
            self.a.append(b.copy())
            return
        if k==0:
            return
        for i in range(ind,10):
            if (n-i>=0):
                b.append(i)
                self.solve(k-1,n-i,b,i+1)
                b.pop()