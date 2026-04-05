class Solution:
    def judgeCircle(self, moves: str) -> bool:
        return (moves.count('U') - moves.count('D'), moves.count('R') - moves.count('L')) == (0, 0)