class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        l=1
        r=0
        for i in range (len(piles)):
            r=max(r,piles[i])

        while(l<r):
            m=l+(r-l)//2
            if(self.isPos(m,piles,h)):
                r=m
            else:
                l=m+1
        return l
    def isPos(self,m,piles,h):
        c=0
        for i in piles:
            c=c+i//m
            if i%m!=0:
                c=c+1
        return c<=h
