class Solution:
    def minInsertions(self, s: str) -> int:
        i=0
        c=0
        ans=0
        while(i<len(s)):
            if s[i]=='(':
                c+=1
                i+=1
            else:
                if c>0:
                    
                    c-=1
                else:
                    ans+=1
                if i+1<len(s) and s[i+1]==')':
                    i+=2
                    
                else:
                    ans+=1
                    i+=1
        return ans+(2*c)


                
                
        