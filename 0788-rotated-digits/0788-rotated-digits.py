class Solution:
    def rotatedDigits(self, n: int) -> int:
        c=0
        for i in range(1,n+1):
            if(self.isGood(i)):
                c+=1
        return c
    def isGood(self,n):
        changed=False

        while(n>0):
            d=n%10
            if d in [3,7,4]:
                return False
            if d in [2,5,6,9]:
                changed=True
            n//=10
        return changed
        
        