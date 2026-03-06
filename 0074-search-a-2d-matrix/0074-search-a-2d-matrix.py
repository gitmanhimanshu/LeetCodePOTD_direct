class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        l=0
        r=len(matrix)*len(matrix[0])-1
        d=len(matrix[0])
        ans=-1
        while(l<=r):
            mid=l+(r-l)//2
            if(matrix[mid//d][mid%d]==target):
                return True
            if(matrix[mid//d][mid%d]>target):
                r=mid-1
            else:
                l=mid+1
        return False
                       
            
        