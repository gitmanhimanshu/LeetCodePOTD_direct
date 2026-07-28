class Solution:
    def smallestPalindrome(self, s: str) -> str:
        c=list(s)
        n=len(c)
        c[:n//2]=sorted(c[:n//2])
        for i in range (n//2):
            c[n-i-1]=c[i]
        return "".join(c)