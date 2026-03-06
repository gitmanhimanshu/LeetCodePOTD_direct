class Solution:
    def checkOnesSegment(self, s: str) -> bool:
    #    return "01" not in s
        return s.count("01")==0


# // class Solution {
# //     public boolean checkOnesSegment(String s) {
# //         return !s.contains("01");
# //     }
# // }