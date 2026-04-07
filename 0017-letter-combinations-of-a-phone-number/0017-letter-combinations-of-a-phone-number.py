class Solution:
    def __init__(self):
        self.letter=['','','abc','def','ghi','jkl','mno','pqrs','tuv','wxyz']
        self.a=[]
    def letterCombinations(self, digits: str) -> List[str]:
        self.solve(digits,0,'')
        return self.a
    def solve(self,digit,i,s):
        if(i==len(digit)):
            self.a.append(s)
            return
        for j in (self.letter[int(digit[i])]):
            self.solve(digit,i+1,s+j)
        