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
    void solve(TreeNode left,TreeNode right,int l){
        if(left==null||right==null){
            return;
        }
        if(l%2==0){
           int le=left.val;
           left.val=right.val;
           right.val=le;
        }
        solve(left.left,right.right,l+1);
        solve(left.right,right.left,l+1);
        
    }
    public TreeNode reverseOddLevels(TreeNode root) {
    solve(root.left,root.right,0);
    return root;

    }
}