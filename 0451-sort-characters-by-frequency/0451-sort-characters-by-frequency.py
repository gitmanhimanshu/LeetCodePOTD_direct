class Solution:
    def frequencySort(self, s: str) -> str:
        d={}
        for i in s:
            d[i]=d.get(i,0)+1
        s=sorted(d.items(),key=lambda x:x[1],reverse=True)
        res=[]
        for i,e in s:
            res.append(i*e)
        return "".join(res)


        