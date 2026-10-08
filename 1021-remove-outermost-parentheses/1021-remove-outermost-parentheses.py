class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        c=0
        a=[]
        for i in s:
            if i=='(':
                if c>0:
                    a.append(i)
                c+=1
            else:
                if c>1:
                    a.append(i)
                c-=1
        return "".join(a)

        