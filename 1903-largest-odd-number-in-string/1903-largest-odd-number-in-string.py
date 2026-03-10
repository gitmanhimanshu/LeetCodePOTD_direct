class Solution:
    def largestOddNumber(self, num: str) -> str:
        ind=-1
        for i in range (len(num)-1,-1,-1):
            if (int(num[i]))%2!=0:
                ind=i
                break
        return "" if ind==-1 else num[0:ind+1]
        