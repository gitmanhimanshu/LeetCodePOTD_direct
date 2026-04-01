class Solution:
    def __init__(self):
        self.dp={}
    def minDistance(self, word1: str, word2: str) -> int:
        return self.solve(0,0,word1,word2)
    def solve(self,i,j,s1,s2):
        if (i,j) in self.dp:
            return self.dp[(i,j)]
        if i==len(s1):
            return len(s2)-j
        if j==len(s2):
            return len(s1)-i
        if s1[i]==s2[j]:
            self.dp[(i,j)]=self.solve(i+1,j+1,s1,s2)
        else:
            self.dp[(i,j)]= 1+min(self.solve(i,j+1,s1,s2),self.solve(i+1,j,s1,s2))
        return self.dp[(i,j)]

        