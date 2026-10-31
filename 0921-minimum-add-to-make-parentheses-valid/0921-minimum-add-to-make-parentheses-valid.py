class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        a=[]
        for i in s:
            if i=='(':
                a.append(i)
            else :
                if len(a)>0 and a[-1]=='(':
                    a.pop()
                else:
                    a.append(i)
        return len(a)
        