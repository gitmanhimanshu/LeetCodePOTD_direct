class Solution:
    def maxSubarrayLength(self, nums: List[int], k: int) -> int:
        him={}
        ans=float('-inf')
        l=0
        for r in range (len(nums)):
            him[nums[r]]=him.get(nums[r],0)+1
            while(him[nums[r]]>k):
                him[nums[l]]=him.get(nums[l],0)-1
                if(him[nums[l]]==0):
                    del him[nums[l]]
                l+=1
            ans=max(ans,r-l+1)
        return ans