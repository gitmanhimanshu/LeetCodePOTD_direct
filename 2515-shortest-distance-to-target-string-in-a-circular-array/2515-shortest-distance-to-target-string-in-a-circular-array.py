class Solution:
    def closestTarget(self, words: List[str], target: str, startIndex: int) -> int:
        n = len(words)
        ans = float('inf')
        
        for i in range(n):
            if words[i] == target:
                dif=abs(startIndex-i)
                ans=min(ans,dif,n-dif)
        
        return -1 if ans == float('inf') else ans