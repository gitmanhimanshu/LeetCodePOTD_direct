class Solution:
    def __init__(self):
        self.a=[]
        self.b=[]
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        candidates.sort()
        self.solve(candidates,target,0)
        return self.a
    def solve(self,arr,t,ind):
        if t==0:
            self.a.append(self.b.copy())
            return
        if (ind>=len(arr) or t<0):
            return
        for i in range(ind,len(arr)):
            if i>ind and arr[i]==arr[i-1]:
                continue
            self.b.append(arr[i])
            self.solve(arr,t-arr[i],i+1)
            self.b.pop()
            
        


        