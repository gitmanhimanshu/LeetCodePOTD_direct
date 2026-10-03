class Solution:
    def longestValidParentheses(self, s: str) -> int:
        a=[]
        a.append(-1)
        ans=0
        for i in range(len(s)):
            if s[i]=='(':
                a.append(i)
            else:
                a.pop()
                if len(a)==0:
                    a.append(i)
                ans=max(ans,i-a[-1])
        return ans
        