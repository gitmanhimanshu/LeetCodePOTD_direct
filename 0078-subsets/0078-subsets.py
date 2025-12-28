class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        l=[]
        self.solve(nums,l,[],0)
        return l
    def solve(self,nums:List[int],l,a,ind):
        l.append(a.copy())
        for i in range(ind,len(nums)):
            a.append(nums[i])
            self.solve(nums,l,a,i+1)
            a.pop()


        
        