class Solution:
    def __init__(self):
        self.mod = 1000000007

    def countGoodNumbers(self, n: int) -> int:
        return (self.solve(5, (n + 1) // 2) % self.mod * 
                self.solve(4, n // 2) % self.mod) % self.mod

    def solve(self, x: int, n: int) -> int:
        if n == 0:
            return 1
        
        half = self.solve(x, n // 2) % self.mod
        
        if n % 2 == 1:
            return (x * (half * half % self.mod)) % self.mod
        
        return (half * half) % self.mod