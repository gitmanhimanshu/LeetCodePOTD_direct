class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        row=len(board)
        col=len(board[0])
        a = [[0]*col for _ in range(row)]
        for i in range(row):
            for j in range(col):
                if board[i][j]==word[0]:
                    if self.solve(a,board,i,j,word,0):
                        return True
        return False
    def solve(self,a,board,i,j,word,c):
        if (c==len(word)):
            return True
        if( i<0 or j<0 or j>=len(board[0]) or i>=len(board) or a[i][j]==1 or board[i][j]!=word[c]):
            return False
        a[i][j]=1
        got =self.solve(a,board,i-1,j,word,c+1) or self.solve(a,board,i+1,j,word,c+1) or self.solve(a,board,i,j+1,word,c+1)or self.solve(a,board,i,j-1,word,c+1)
        a[i][j]=0
        return got
        