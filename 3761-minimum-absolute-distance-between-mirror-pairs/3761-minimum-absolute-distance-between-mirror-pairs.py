class Solution:
    def minMirrorPairDistance(self, nums: List[int]) -> int:
        him={}
        ans=float('inf')
        for i in range(len(nums)):
            rev=self.reverseNum(nums[i])
            if nums[i] in him:
                ans=min(abs(i-him[nums[i]]),ans)
            him[rev]=i
        return ans if ans!=float('inf') else -1
    def reverseNum(self, num: int) -> int:
        rev = 0
        while num != 0:
            digit = num % 10
            rev = rev * 10 + digit
            num //= 10
        return rev