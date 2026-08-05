class Solution:
    def remainingMethods(self, n: int, k: int, invocations: List[List[int]]) -> List[int]:
        him=[[] for i in range (n)]
        for a in invocations:
            him[a[0]].append(a[1])
        sp=[False]*n
        self.solve(him,k,sp)
        ans=[]
        got=False
        for a in invocations:
            if not sp[a[0]] and sp[a[1]]:
                got=True
        for i in range(n):
            if(got):
                ans.append(i)
            else:
                if not sp[i]:
                    ans.append(i)
        return ans




    def solve(self,him,k,sp):
        sp[k]=True
        for i in him[k]:
            if not sp[i]:
                self.solve(him,i,sp)