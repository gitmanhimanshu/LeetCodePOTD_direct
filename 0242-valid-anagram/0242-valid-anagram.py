class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        l1=list(s)
        l2=list(t)
        if len(l1)!=len(l2):
            return False
        l1.sort()
        l2.sort()
        for i in range (len(l1)):
            if (l1[i]!=l2[i]):
                return False
        return True


        