class Solution:
    def hasAllCodes(self, s: str, k: int) -> bool:
        v=set()
        for i in range(len(s)-k+1):
            v.add(s[i:i+k])
        return len(v)==(1<<k)
        