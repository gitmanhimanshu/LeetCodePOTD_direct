class Solution:
    def __init__(self):
        self.l=[]
    def generateParenthesis(self, n: int) -> List[str]:
        self.solve(n,"",0,0)
        return self.l
    def solve(self,n,s,c,r):
        if (c+r==2*n):
            self.l.append(s)
        if c<n:     
            self.solve(n,s+'(',c+1,r)        
        if r<c:       
            self.solve(n,s+')',c,r+1)
          



        