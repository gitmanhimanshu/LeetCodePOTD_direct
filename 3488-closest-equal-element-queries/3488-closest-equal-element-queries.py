class Solution:
    def solveQueries(self, nums: List[int], queries: List[int]) -> List[int]:
        him={}
        n=len(nums)
        for i in range(n):
            if nums[i] not in him:
                him[nums[i]]=[]
            him[nums[i]].append(i)
        ans =[]
        for i in range(len(queries)):
            ele=nums[queries[i]]
            l=him[ele]
            if len(l)==1:
                ans.append(-1)
                continue
            ind=self.find(l,queries[i])
            left= abs(queries[i]- l[((ind-1+len(l))%len(l))])
            right=abs(queries[i]- l[((ind+1)%len(l))])
            leftbacha=n-left
            rightbacha=n-right
            ans.append(min(left,right,leftbacha,rightbacha))
        return ans
    def find(self,a,t):
        s=0
        r=len(a)-1
        while(s<=r):
            mid=s+(r-s)//2
            if a[mid]==t:
                return mid
            elif (t>=a[mid]):
                s=mid+1
            else:
                r=mid-1
        return -1


        