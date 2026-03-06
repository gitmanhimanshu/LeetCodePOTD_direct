class Solution:
    def checkOnesSegment(self, s: str) -> bool:
        return "01" not in s

# // class Solution {
# //     public boolean checkOnesSegment(String s) {
# //         return !s.contains("01");
# //     }
# // }