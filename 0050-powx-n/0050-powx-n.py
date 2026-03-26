class Solution:
    def myPow(self, x: float, n: int) -> float:
        sign=-1 if n<0 else 1
        n=n*-1 if n<0 else n
        power=self.power(x,n)
        return power if sign==1 else 1/power
    def power(self,x,n):
        if n==0:
            return 1
        pow=self.power(x,n//2)
        if n&1==0:
            return pow*pow
        else:
            return x*pow*pow


        