class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        res=[]
        c=0
        for i in s:
            if i=='(':
                if c>0:
                    res.append(i)
                c+=1
            else:
                if c>1:
                    res.append(i)
                c-=1
        return "".join(res)