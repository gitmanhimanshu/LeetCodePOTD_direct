class Solution:
    def twoEditWords(self, queries: List[str], dictionary: List[str]) -> List[str]:
        ans=[]
        for q in queries:
            for d in dictionary:
                diff=sum(a!=b for a,b in zip(q,d))
                if diff<=2:
                    ans.append(q)
                    break
        return ans
        