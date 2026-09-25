class Solution:
    def longestSubarray(self, nums: list[int]) -> int:

        i=0
        j=0
        ans=0
        zero=0

        while(j<len(nums)):
            if(nums[j]==0):
                zero+=1
            while(zero>1):
                if nums[i]==0:
                    zero-=1
                i+=1
            ans=max(ans,j-i)
            j+=1
        return ans if zero!=0 else len(nums)-1

    #     ans=0
    #     zero=0
    #     for i in range(len(nums)):
    #         if nums[i]==0:
    #             zero+=1
    #             ans=max(ans,self.find(nums,i))
    #     return ans if zero!=0 else len(nums)-1

    # def find(self,nums,i):
    #     c=0
    #     m=0
    #     for j in range(len(nums)):
    #         if(i==j):
    #             continue
    #         if nums[j]==1:
    #             c+=1
    #         else:
    #             c=0
    #         m=max(m,c)
    #     return m
        