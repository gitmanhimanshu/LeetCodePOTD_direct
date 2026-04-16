class Solution:
    def __init__(self):
        self.a=[]

    def solveNQueens(self, n: int) -> List[List[str]]:
        board=[[0]*n for i in range (n)]
        self.solve(board,0)
        return self.a
    def solve(self,b,r):
        if(r==len(b)):
            self.got(b)
            return
        for i in range(len(b)):
            if self.isSafe(b,r,i):
                b[r][i]=1
                self.solve(b,r+1)
                b[r][i]=0
    def got(self,b):
        l=[]
        
        for i in range(len(b)):
            st=[]
            for j in range(len(b)):
                st.append('Q' if b[i][j]==1 else ".")
            l.append("".join(st))
        self.a.append(l)
    def isSafe(self, b, i, j):
        n = len(b)

        # check row
        for c in range(n):
            if c == j:
                continue
            if b[i][c]:
                return False

        # check column
        for r in range(n):
            if r == i:
                continue
            if b[r][j]:
                return False

        # down-right diagonal
        r, c = i + 1, j + 1
        while r < n and c < n:
            if b[r][c]:
                return False
            r += 1
            c += 1

        # up-left diagonal
        r, c = i - 1, j - 1
        while r >= 0 and c >= 0:
            if b[r][c]:
                return False
            r -= 1
            c -= 1

        # down-left diagonal
        r, c = i + 1, j - 1
        while r < n and c >= 0:
            if b[r][c]:
                return False
            r += 1
            c -= 1

        # up-right diagonal
        r, c = i - 1, j + 1
        while r >= 0 and c < n:
            if b[r][c]:
                return False
            r -= 1
            c += 1

        return True


        

        