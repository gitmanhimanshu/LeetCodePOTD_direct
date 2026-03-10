class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        him={}
        if len(s)!=len(t):
            return False
        for i in range(len(s)):
            a=s[i]
            b=t[i]
            if a in him:
                l=him[a]
                if l!=b:
                    return False
            else:
                l=b
                if l in him.values():
                    return False
                else:
                    him[a]=b
        return True

        