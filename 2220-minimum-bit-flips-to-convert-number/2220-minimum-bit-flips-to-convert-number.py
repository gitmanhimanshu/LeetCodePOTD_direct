class Solution:
    def minBitFlips(self, start: int, goal: int) -> int:
        f=start^goal
        ans=0
        while(f>0):
            if(f%2==1):
                ans+=1
            f//=2
        return ans

        