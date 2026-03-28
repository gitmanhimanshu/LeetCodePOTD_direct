class Solution:
    def __init__(self):
        self.a=[]
        self.b=[]
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        self.solve(candidates,0,target,0)
        return self.a
    def solve(self,arr,i,target,sum):
        if (i==len(arr) or sum>target):
            return
        if(sum==target):
            self.a.append(self.b.copy())
            return
        self.b.append(arr[i])
        self.solve(arr,i,target,sum+arr[i])
        self.b.pop()
        self.solve(arr,i+1,target,sum)




        