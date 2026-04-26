class Solution:
    def __init__(self):
        self.dir = [(1, 0), (-1, 0), (0, 1), (0, -1)]
    def containsCycle(self, grid: List[List[str]]) -> bool:
        row=len(grid)
        col=len(grid[0])
        v=[[False]*col  for i in range(row)]
        def solve(i,j,prev_i,prev_j):
            v[i][j]=True
            for dx,dy in self.dir:
                nx=i+dx
                ny=j+dy
                if(nx<0 or ny<0 or nx>=row or ny>=col):
                    continue
                if (grid[i][j]!=grid[nx][ny]) :
                    continue
                if nx==prev_i and ny==prev_j:
                    continue
                if v[nx][ny]:
                    return True
                if solve(nx,ny,i,j):
                    return True

            return False
        
        for i in range(row):
            for j in range(col):
                if not v[i][j]:
                    if solve(i,j,-1,-1):
                        return True
        return False
