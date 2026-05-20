class Solution:
    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        first=[False] *(len(A)+1)
        second=[False] *(len(A)+1)

        ans=[0]*len(A)
        for i in range (len(A)):
            first[A[i]]=True
            second[B[i]]=True
            ans[i]=self.count(first,second)
        return ans
    def count(self,f,s):
        c=0
        for i in range(len(f)):
            if f[i]==True and s[i]==True:
                c+=1
        return c

        