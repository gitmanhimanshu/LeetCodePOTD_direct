class Solution:
    def splitArray(self, nums: List[int], k: int) -> int:
        l=max(nums)
        r=sum(nums)
        ans=-1
        while(l<=r):
            m=l+(r-l)//2
            if(self.isPos(nums,m,k)):
                ans=m
                r=m-1
            else:
                l=m+1
        return ans
    def isPos(self,nums:List[int],m:int,k:int)->bool:
        t=1
        sum=0
        for i in nums:
            sum+=i
            if(sum>m):
                t+=1
                sum=i
        return t<=k

        