class Solution:
    def maxDepth(self, s: str) -> int:
        c=0
        ans=0
        for i in s:
            if i=='(':
                c+=1
            elif i==')':
                c-=1
            ans=max(ans,c)
        return ans
        