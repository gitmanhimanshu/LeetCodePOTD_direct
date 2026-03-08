class Solution:
    def reverseWords(self, s: str) -> str:
        t=s.strip().split(' ')
        ans=[]
        for i in range(len(t)-1,-1,-1):
            st=t[i]
            if st.strip():
                ans.append(st)
        return " ".join(ans)

        