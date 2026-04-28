class Solution:
    def removeDuplicates(self, s: str) -> str:
        a=[]
        for i in s:
            if len(a)>0 and a[-1]==i:
                a.pop()
            else:
                a.append(i)
        return "".join(a)

        