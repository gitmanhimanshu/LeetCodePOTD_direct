class Solution:
    def closestTarget(self, words: List[str], target: str, startIndex: int) -> int:
        n = len(words)
        ans = float('inf')
        
        for i in range(n):
            if words[i] == target:
                diff = abs(startIndex - i)
                ans = min(ans, diff, n - diff)
        
        return -1 if ans == float('inf') else ans