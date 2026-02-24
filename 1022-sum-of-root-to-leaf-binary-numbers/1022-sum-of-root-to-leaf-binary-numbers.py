# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.sum=0
    def sumRootToLeaf(self, root: Optional[TreeNode]) -> int:
        self.findSum(root,"")
        return self.sum

    def findSum(self,root,s):
        if root is None:
            return

        s = s + str(root.val)
        if root.left is None and root.right is None:
            self.sum += self.bintodecimal(s)
            return

        self.findSum(root.left, s)
        self.findSum(root.right, s)
    def bintodecimal(self,s):
        dec=0
        power=0
        for i in range(len(s)-1,-1,-1):
            dec += int(s[i]) * (2 ** power)
            power+=1
        return dec

        
        