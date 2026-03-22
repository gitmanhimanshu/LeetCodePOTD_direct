class Solution:
    def myAtoi(self, s: str) -> int:
        s=s.strip()
        if not s:
            return 0
        n=0
        c=0
        sign=1
        if s[0]=='-' or s[0]=='+':
            if s[0]=='-':
                sign=-1
            c+=1

        while(c<len(s)):
            if s[c]=='0':
                c+=1
            else:
                break
        for i in range(c,len(s)):
            if s[i].isdigit():
                n=n*10+int(s[i])
            else:
                break
        n=n*sign
        MIN=-2**31
        MAX=2**31-1
        if n<MIN:
            return MIN
        if n>MAX:
            return MAX
        return n
