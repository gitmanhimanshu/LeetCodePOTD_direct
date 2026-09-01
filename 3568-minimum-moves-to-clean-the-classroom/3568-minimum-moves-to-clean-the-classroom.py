from collections import deque
from typing import List

class Solution:
    def minMoves(self, classroom: List[str], energy: int) -> int:
        m, n = len(classroom), len(classroom[0])
        litter_id = {}
        sr = sc = 0
        for i in range(m):
            for j in range(n):
                ch = classroom[i][j]
                if ch == 'S':
                    sr, sc = i, j
                elif ch == 'L':
                    litter_id[(i, j)] = len(litter_id)

        L = len(litter_id)
        full = (1 << L) - 1
        if L == 0:
            return 0

        # best[r][c][mask] = max energy with which this state was reached
        best = [[[-1] * (1 << L) for _ in range(n)] for _ in range(m)]
        best[sr][sc][0] = energy
        q = deque([(sr, sc, 0, energy)])
        steps = 0

        while q:
            for _ in range(len(q)):
                r, c, mask, e = q.popleft()
                if e == 0:            # stuck, and not on 'R' (R would have refilled)
                    continue
                for dr, dc in ((1, 0), (-1, 0), (0, 1), (0, -1)):
                    nr, nc = r + dr, c + dc
                    if not (0 <= nr < m and 0 <= nc < n):
                        continue
                    ch = classroom[nr][nc]
                    if ch == 'X':
                        continue
                    nmask, ne = mask, e - 1
                    if ch == 'R':
                        ne = energy
                    elif ch == 'L':
                        nmask |= 1 << litter_id[(nr, nc)]
                    if nmask == full:
                        return steps + 1
                    if best[nr][nc][nmask] < ne:
                        best[nr][nc][nmask] = ne
                        q.append((nr, nc, nmask, ne))
            steps += 1

        return -1