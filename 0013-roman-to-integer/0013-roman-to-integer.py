class Solution:
    def romanToInt(self, s: str) -> int:
        if len(s)==0:
            return 0
        ans=self.get(s[0])
        for i in range(1,len(s)):
            if (self.get(s[i])>self.get(s[i-1])):
                ans+=self.get(s[i])-(2*self.get(s[i-1]))
            else:
                ans+=self.get(s[i])
        return ans


    def get(self,n):
        if n == 'I':
            return 1
        elif n == 'V':
            return 5
        elif n == 'X':
            return 10
        elif n == 'L':
            return 50
        elif n == 'C':
            return 100
        elif n == 'D':
            return 500
        elif n == 'M':
            return 1000
        else:
            return 0