class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        for a in matrix:
            if self.Find(a,target):
                return True
        return False
    def Find(self,a:List[int],t:int)->bool:
        l=0
        r=len(a)-1
        while(l<=r):
            m=l+(r-l)//2
            if(a[m]==t):
                return True
            if(a[m]<t):
                l=m+1
            else:
                r=m-1
        return False
        