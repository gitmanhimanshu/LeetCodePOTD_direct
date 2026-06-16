class Solution:
    def processStr(self, s: str) -> str:
        a=[]
        for i in s:
            if i=='*':
                if len(a)>0:
                    a.pop()
            elif i=='#':
                a.extend(a)
            elif i=='%':
                a=a[::-1]
            else:
                a.append(i)
        return ''.join(a)
        