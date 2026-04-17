class Solution:
    def __init__(self):
        self.a=[]
    def addOperators(self, num: str, target: int) -> List[str]:
        self.solve(num,target,0,0,0,"")
        return self.a
    def solve(self,num,target,ind,total,prev,s):
        if ind==len(num):
            if target==total:
                self.a.append(s)
            return
        for i in range(ind,len(num)):
            if i!=ind and num[ind]=='0':
                break

            st=num[ind:i+1]
            n=int(st)
            if(ind==0):
                self.solve(num,target,i+1,n,n,s+st)
            else:
                self.solve(num,target,i+1,total+n,n,s+'+'+st)
                self.solve(num,target,i+1,total-n,n,s+'-'+st)
                self.solve(num,target,i+1,total-prev+(n*prev),n,s+'*'+st)
            


        