class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        s=0
        ans=0
        for i in gain:
            s+=i
            ans=max(ans,s)

        return ans