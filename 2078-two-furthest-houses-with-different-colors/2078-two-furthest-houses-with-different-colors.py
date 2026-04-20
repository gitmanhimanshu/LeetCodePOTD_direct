class Solution:
    def maxDistance(self, colors: List[int]) -> int:
        mx=0
        for i in range(len(colors)-1,0,-1):
            if colors[i]!=colors[0]:
                mx=max(mx,i-0) 
        for i in range(len(colors)):
            if colors[i]!=colors[len(colors)-1]:
                mx=max(mx,len(colors)-1-i) 
        return mx

        