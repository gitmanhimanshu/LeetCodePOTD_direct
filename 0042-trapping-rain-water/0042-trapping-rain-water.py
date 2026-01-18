class Solution:
    def trap(self, height: List[int]) -> int:
        l = [0] * len(height)
        r = [0] * len(height)
        l[0]=height[0]
        for i in range (1,len(height)):
            l[i]=max(l[i-1],height[i])
        r[len(height)-1]=height[len(height)-1]
        for i in range (len(height)-2,-1,-1):
            r[i]=max(r[i+1],height[i])
        ans=0
        for i in range(0,len(height)):
            ans+=min(r[i],l[i])-height[i]

        return ans