class Solution:
    def maxDistance(self, position: List[int], m: int) -> int:
        l=1
        
        position.sort()
        r=position[-1]-position[0]
        ans=-1
        while(l<=r):
            mid=l+(r-l)//2
            if(self.isPos(position,mid,m)):
                l=mid+1
                ans=mid
            else:
                r=mid-1
        return ans
    def isPos(self,a:List[int],m:int,k:int):
        last=a[0]
        k=k-1
        for i in a:
            if (i-last >=m):
                k=k-1
                last=i
            if k==0:
                return True
        return k==0

        