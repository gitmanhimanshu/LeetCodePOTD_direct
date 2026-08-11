class Solution:
    def missingInteger(self, nums: List[int]) -> int:
        c=0
        v=set()
        for i in nums:
            v.add(i)
        
        c=nums[0]
        for i in range(1,len(nums)):
            if((nums[i]-1 )!=nums[i-1]):
                break
            c+=nums[i]
        x=c
        print(c)
        while x in v:
            x+=1
        return x