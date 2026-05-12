class Solution:
    def nextGreaterElements(self, nums: List[int]) -> List[int]:
        ans=[0]*len(nums)
        a=[0]*(len(nums)*2)
        for i in range(len(nums)):
            a[i]=nums[i]
        for i in range(len(nums)):
            a[i+len(nums)]=nums[i]
        stack=[]
        for i in range(len(a)-1,len(nums)-2,-1):
            while(len(stack)>0 and a[i]>=stack[-1]):
                stack.pop()
            if len(stack)>0:
                ans[i%len(nums)]=stack[-1]
            else:
                ans[i%(len(nums))]=-1
            stack.append(a[i])
        return ans