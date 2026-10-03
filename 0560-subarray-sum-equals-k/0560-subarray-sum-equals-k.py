class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        a={}
        a[0]=1
        ans=0
        sum=0
        for i in nums:
            sum+=i
            if(sum-k) in a:
                ans+= a[sum-k]
            a[sum]=a.get(sum,0)+1
        return ans

        