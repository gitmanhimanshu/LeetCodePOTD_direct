class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        if(len(s)!= len(goal)):
            return False
        sb=list(s)
        for i in range(len(s)):
            if ''.join(sb)==goal:
                return True
            ch=sb[0]
            sb.pop(0)
            sb.append(ch)
        return False
        