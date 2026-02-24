/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root,0);
    }
    int dfs(TreeNode root,int curr){
        if(root==null){
            return 0;
        }
        int val=(curr<<1)|root.val;
        if(root.left==null &&root.right==null){
            return val;
        }
        return dfs(root.left,val)+dfs(root.right,val);
    }
}



// # Definition for a binary tree node.
// # class TreeNode:
// #     def __init__(self, val=0, left=None, right=None):
// #         self.val = val
// #         self.left = left
// #         self.right = right
// class Solution:
//     def __init__(self):
//         self.sum=0
//     def sumRootToLeaf(self, root: Optional[TreeNode]) -> int:
//         self.findSum(root,"")
//         return self.sum

//     def findSum(self,root,s):
//         if root is None:
//             return

//         s = s + str(root.val)
//         if root.left is None and root.right is None:
//             self.sum += self.bintodecimal(s)
//             return

//         self.findSum(root.left, s)
//         self.findSum(root.right, s)
//     def bintodecimal(self,s):
//         dec=0
//         power=0
//         for i in range(len(s)-1,-1,-1):
//             dec += int(s[i]) * (2 ** power)
//             power+=1
//         return dec

        
        