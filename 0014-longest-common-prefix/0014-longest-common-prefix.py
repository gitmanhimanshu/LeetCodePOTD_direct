class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        strs.sort()
        i=0
        one=strs[0]
        two=strs[-1]
        while i<len(one) and i<len(two) and one[i]==two[i]:
            i+=1
        return one[0:i]
        