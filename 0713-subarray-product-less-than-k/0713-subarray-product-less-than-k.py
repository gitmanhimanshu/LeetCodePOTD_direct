class Solution:
    def numSubarrayProductLessThanK(self, nums: list[int], k: int) -> int:
        mul=1
        i=0
        j=0
        ans=0
        while j<len(nums):
            mul=mul*nums[j]
            while(mul>=k and i<=j):
                mul=mul//nums[i]
                i+=1
            ans+=j-i+1
            j+=1
        return ans
        